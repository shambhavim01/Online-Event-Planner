
 

        const packageAdder=document.getElementById("package-adder");
        const packageList=[{
            functionType:"Marriage",
            packageType:"Basic",
            amount:60000,
            id:1,
            listOfService:["Decoration","Photograph","Catering"],
            description:"The ad begins with a beautiful cinematic shot of a serene wedding venue bathed in soft golden sunlight."
        },
        {
            functionType:"BirthDay",
            packageType:"Premium",
            amount:40000,
            packageId:2,
            listOfService:["Decoration","Photograph","Catering"],
            description:"The ad begins with a beautiful cinematic shot of a serene wedding venue bathed in soft golden sunlight."
        },
       
        
    ]
    

        // Function to create and append the package element
        const createPackageElement= () =>{


          
           // Loop through the packageList and create elements for each package
             let i=1;
             for (const packageData of packageList) {
                // Create a container for the package
                const packageContainer = document.createElement("div");
                packageContainer.classList.add("package-container");

                // Create the inner structure with data from packageList
                packageContainer.innerHTML = `
                    <div class="package-container-img">
                        <img src=./images/img${i}.jpg alt="Event image"\>
                    </div>
                    <div class="package-container-body">
                        <div class="package-container-body-overlay"></div>
                        <div class="package-container-body-info">
                            <p class="package-container-body-info-title">${packageData.functionType}</p>
                            <div class="package-container-body-info-separator"></div>
                            <p class="package-container-body-info-basic">${packageData.packageType}</p>
                            <p class="package-container-body-info-price">Rs:${packageData.amount}</p>
                            <p class="package-container-body-info-id">${packageData.PackageId}</p>
                            <div class="package-container-body-info-service">
                                ${packageData.listOfService.map(service => `<p class="info-service">${service}</p>`).join('')}
                                <p class="info-service-description">${packageData.description}</p>
                            </div>
                        </div>
                    </div>
                `;
                i++;
               // Append the package element to the target container
            const targetContainer = document.querySelector(".package");
            // targetContainer.appendChild(packageContainer);
            targetContainer.insertBefore(packageContainer,packageAdder);
            }
           
        }

        // Call the function to create and append the package element
        createPackageElement();
   
       

