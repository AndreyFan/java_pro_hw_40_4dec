package de.telran.onlineshop.controller;

import de.telran.onlineshop.service.CategoriesService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest(CategoriesController.class)
class CategoriesControllerTest {

    @Autowired
    private MockMvc mockMvc; // для имитации запросов пользователей

    @MockBean
    private CategoriesService categoriesServiceMock;

//    @Test
//    void getAllCategories() {
//       when(categoriesServiceMock.getAllCategories()).thenReturn(List.of(new ))
//
//    }
//    @BeforeEach
//    void setUp() {
//    }
//
//    @AfterEach
//    void tearDown() {
//    }
//

//
//    @Test
//    void getCategoryById() {
//    }
//
//    @Test
//    void getCategoryByName() {
//    }
//
//    @Test
//    void createCategories() {
//    }
//
//    @Test
//    void updateCategories() {
//    }
//
//    @Test
//    void deleteCategories() {
//    }
//
//    @Test
//    void handleTwoException() {
//    }
//
//    @Test
//    void handleException() {
//    }
}