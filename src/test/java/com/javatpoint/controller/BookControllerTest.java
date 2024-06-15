package com.javatpoint.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.javatpoint.model.Books;
import com.javatpoint.service.BooksService;

@ExtendWith(MockitoExtension.class)
class BooksControllerTest {

	@InjectMocks
	private BooksController controller;
	
	@Mock
	BooksService booksService;

	@Test
	void testGetBooks() throws Exception {
		
		MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        Books book=new Books();
        Mockito.when(booksService.getBooksById(1)).thenReturn(book);
        Books responseEntity= controller.getBooks(1);
        
	}

}
