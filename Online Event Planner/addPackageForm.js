

const getButton = document.getElementById('get');
const multiInput = document.querySelector('multi-input'); 
const values = document.querySelector('#values'); 



document.querySelector('input').focus();

document.querySelector('input').focus();
        // JavaScript code for form submission (you can add more functionality as needed)
        document.getElementById("addPackageForm").addEventListener("submit", function (e) {
            e.preventDefault();

            // Get form data
            const packageId = document.getElementById("packageId").value;
            const functionType = document.getElementById("functionType").value;
            const packageType = document.getElementById("packageType").value;
            const amount = document.getElementById("amount").value;
            const description=document.getElementById("description");
            let listOfService;

            // You can perform further actions here, such as sending the data to a server.
            if (multiInput.getValues().length > 0) {
                console.log(multiInput.getValues());
                listOfService=multiInput.getValues();
              } else {
                values.textContent = 'Got noone  :`^(.'; 
              }

              const packageObj={
                packageId:packageId,
                packageType:packageType,
                functionType:functionType,
                amount:amount,
                listOfService:listOfService,
                description:description
                
              }
              console.log(packageObj);
              // window.location.href='/vendor.html'
              
        
        });





       