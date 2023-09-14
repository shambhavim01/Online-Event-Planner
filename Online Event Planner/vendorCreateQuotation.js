

const createQuotations=document.querySelectorAll(".create-quotation");


// Function to calculate the number of days between two dates
const calculateNumberOfDays=(fromDate, toDate) =>{
    const startDate = new Date(fromDate);
    const endDate = new Date(toDate);
    
    // Calculate the time difference in milliseconds
    const timeDifference = endDate - startDate;
    // Convert milliseconds to days
    const daysDifference = timeDifference / (1000 * 60 * 60 * 24);
    
    return daysDifference;
}



createQuotations.forEach(Quot => {
    Quot.addEventListener('click',(e)=>{
    const row = event.target.closest('tr');

    
    // Extract the data from the row
    const requestId = row.querySelector('td:nth-child(1)').textContent;
    const fromDate = row.querySelector('td:nth-child(2)').textContent;
    const toDate = row.querySelector('td:nth-child(3)').textContent;
    const listOfService = Array.from(row.querySelectorAll('td:nth-child(4) li')).map(li => li.textContent);
    const numOfPerson = row.querySelector('td:nth-child(5)').textContent;
    const otherService = Array.from(row.querySelectorAll('td:nth-child(6) li')).map(li => li.textContent);

    let noOfDays = calculateNumberOfDays(fromDate, toDate);
    
    // Log the data to the console
    console.log('Request ID:', requestId);
    console.log('From Date:', fromDate);
    console.log('To Date:', toDate);
    console.log('List Of Service:', listOfService);
    console.log('Number of Persons:', numOfPerson);
    console.log('Other Service:', otherService);
    console.log('number of Days', noOfDays);



    window.location.href='/createQuotationForm.html';
    })
});