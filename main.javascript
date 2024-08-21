document.addEventListener('DOMContentLoaded', () => {
    const taskInput = document.getElementById('taskInput');
    const addTaskButton = document.getElementById('addTaskButton');
    const taskList = document.getElementById('taskList');

    // Function to create a new task item
    function createTaskItem(taskText) {
        const li = document.createElement('li');

        const textNode = document.createTextNode(taskText);
        li.appendChild(textNode);

        const deleteButton = document.createElement('button');
        deleteButton.textContent = 'Delete';
        deleteButton.addEventListener('click', () => {
            taskList.removeChild(li);
        });

        li.appendChild(deleteButton);

        li.addEventListener('click', () => {
            li.classList.toggle('completed');
        });

        return li;
    }

    // Event listener for adding a new task
    addTaskButton.addEventListener('click', () => {
        const taskText = taskInput.value.trim();
        if (taskText !== '') {
            const taskItem = createTaskItem(taskText);
            taskList.appendChild(taskItem);
            taskInput.value = '';
        }
    });

    // Event listener for Enter key press in the input field
    taskInput.addEventListener('keypress', (e) => {
        if (e.key === 'Enter') {
            addTaskButton.click();
        }
    });
});
