package com.example.springboot.testwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {

	private TodoService service;
	
	public TodoController(TodoService service) {
		super();
		this.service = service;
	}

	@RequestMapping("/list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = service.findByUsername("haburu");
		model.addAttribute("todos",todos);
		
		return "/listTodos";
	}
	
	@RequestMapping(value = "/add-todo", method=RequestMethod.GET)
	public String showNewTodoPage(ModelMap model) {
		String usrename = (String)model.get("name");
		Todo todo = new Todo(0, usrename, "", LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "/todo";
	}
	
	@RequestMapping(value = "/add-todo", method=RequestMethod.POST)
	public String addwNewTodoPage(ModelMap model, Todo todo) {
		String usrename = (String)model.get("name");
		service.addTodo(usrename, todo.getDescription(),
									LocalDate.now().plusYears(1), false);
		return "redirect:/list-todos";
	}
}
