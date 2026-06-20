package test.java;

// Импорты для JUnit
import org.junit.jupiter.api.Test;
import static org.junit.jupite

@Test void testCheckYourself(){
// Создаем объект
SimpleStartup startup=new SimpleStartup();

// Устанавливаем ячейки
int[]locations={2,3,4};startup.setLocationCells(locations);

// Проверяем попадание
String result=startup.checkYourself(2);assertEquals("попал",result,"Должен быть попадание!");

// Проверяем промах

assertEquals("мимо",result2,"Должен быть промах!");}}