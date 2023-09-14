

// Get the form element
const quotationForm = document.getElementById('quotation-Form');

// Add a submit event listener to the form
quotationForm.addEventListener('submit', function (e) {
    e.preventDefault(); // Prevent the default form submission

    // Get form values
    const uniqueId = document.getElementById('uniqueId').value;
    const package = document.getElementById('package').value;
    const estimatedAmount = document.getElementById('estimatedAmount').value;
    const vendorId = document.getElementById('vendorId').value;
    const userId = document.getElementById('userId').value;
    const planRequestId = document.getElementById('planRequestId').value;
    const status = document.getElementById('status').value;

    // Create an object to hold the form data
    const formData = {
        uniqueId,
        package,
        estimatedAmount,
        vendorId,
        userId,
        planRequestId,
        status
    };

    // Log the form data to the console
    console.log('Form Data:', formData);

    // You can now use formData to send the data to a server or perform further actions.
});
