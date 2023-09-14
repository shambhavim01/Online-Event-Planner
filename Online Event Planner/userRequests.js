

        // Dummy data
        const dummyData = [
            {
                requestId: 101,
                fromDate: '2023-09-10',
                toDate: '2023-09-15',
                listOfService: ['Catering', 'Decoration', 'Photography'],
                numOfPerson: 250,
                otherService: ['Entertainment', 'Floral Arrangement'],
            },
            {
                requestId: 102,
                fromDate: '2023-02-12',
                toDate: '2023-02-10',
                listOfService: ['Venue Booking', 'DJ Services', 'Transportation'],
                numOfPerson: 150,
                otherService: ['Lighting', 'Sound System'],
            },
            {
                requestId: 103,
                fromDate: '2023-06-13',
                toDate: '2023-06-10',
                listOfService: ['Catering', 'Decoration', 'Photography'],
                numOfPerson: 250,
                otherService: ['Entertainment', 'Floral Arrangement'],
            },
            {
                requestId: 104,
                fromDate: '2023-09-12',
                toDate: '2023-09-10',
                listOfService: ['Venue Booking', 'DJ Services', 'Transportation'],
                numOfPerson: 150,
                otherService: ['AV Technicians', 'Sound System'],
            }
        ];

        
        // Function to create table rows and insert data dynamically
        const createTableRows =()=> {
            const tableBody = document.getElementById('tableBody');

            // Loop through the dummy data and create table rows
            dummyData.forEach(data => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${data.requestId}</td>
                    <td>${data.fromDate}</td>
                    <td>${data.toDate}</td>
                    <td>
                        <ul>${data.listOfService.map(service => `<li>${service}</li>`).join('')}</ul>
                    </td>
                    <td>${data.numOfPerson}</td>
                    <td>
                        <ul>${data.otherService.map(service => `<li>${service}</li>`).join('')}</ul>
                    </td>
                    <td>
                        <button class="create-quotation">Create Quotation</button>
                    </td>
                `;

                tableBody.appendChild(row);
            });
        }

        // Call the function to create and insert table rows
        createTableRows();
        
    
