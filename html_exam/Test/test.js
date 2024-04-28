const todoList = document.getElementById('todo-item-list');

let basicDatas = [
    { id: 1, title: "Todo 1", done: false },
    { id: 2, title: "Todo 2", done: true },
];

basicDatas.forEach(data => {
    const list_item = document.createElement('li');
    list_item.textContent = data.title;
    if(data.done){
        list_item.classList.add('checked');
    }
    list_item.classList.add('todo-item');
    todoList.appendChild(list_item);

    list_item.addEventListener('click', ()=> {
        list_item.classList.toggle('checked');
        data.done = !data.done;
    })
})

const btn = document.getElementById('btn');
const inputField = document.getElementById('todo-input');
const form  = document.getElementById('todo-form');

function addTodo(){
    const inputText = inputField.value;

    if (inputText === ''){
        alert('할일을 입력해주세요!')
        return;
    }

    const newTodo = {
        id : basicDatas.length + 1,
        title : inputText,
        done: false
    };

    basicDatas.push(newTodo);
    const listItem = document.createElement('li');
    listItem.textContent = newTodo.title;
    listItem.classList.add('todo-item');
    todoList.appendChild(listItem);

    inputField.value = "";

    listItem.addEventListener('click', ()=>{
        listItem.classList.toggle('checked');
        newTodo.done = !newTodo.done;
    })
}

btn.addEventListener("click", addTodo);

form.addEventListener('submit', function(event){
    event.preventDefault();
});

inputField.addEventListener("keydown", function(event) {
    if (event.key === "Enter"){
        addTodo();
    }
});
