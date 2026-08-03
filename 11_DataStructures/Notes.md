```java
// 1. Collection - САМЫЙ БАЗОВЫЙ
Collection<Car> cars = new ArrayList<>();
// Можно:
// - add(), remove(), size(), isEmpty(), contains()
// - forEach(), stream(), iterator()

// 2. List - ДОБАВЛЯЕТ работу с индексами
List<Car> cars = new ArrayList<>();
// Можно ВСЁ из Collection ПЛЮС:
// - get(index), set(index, element)
// - indexOf(), lastIndexOf()
// - subList(), sort()
// - listIterator()

// 3. ArrayList - ДОБАВЛЯЕТ специфические методы
ArrayList<Car> cars = new ArrayList<>();
// Можно ВСЁ из List ПЛЮС:
// - trimToSize()
// - ensureCapacity()
// - clone()
```