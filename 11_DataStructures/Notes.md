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

- `List` - когда важен порядок. Элементы по индексу.
- `Set` - когда важна уникальность. 
- `Map` - когда важно нахождение значения по ключу. Ключи не повторяются

- Интерфейс Map не расширяет интерфейс Collections
- При этом Map все равно считается частью Collection Framework (API коллекций)


- **Extends** — расширяет, наследование от родителя
- **Implements** — реализует интерфейс
```PlantUml

Interface Collections
Interface Set extends Collections
Interface List extends Collections
Interface SortedSet extends Set
Class TreSet implements SortedSet
Class LinkedHashSet implements Set
Class HashSet implements Set
Class ArayList implements List
Class LinkedList implements List
Class Vector implements List

Interface Map
Interface SorttedMap extends Map
Class TreeMap implements SorttedMap
Class HashMap implements Map
Class LinkedHashMap implements Map
Class Hashtable implements Map



```
----
### HashSet
- HashSet - это Set который использует хэш таблицу для быстрого поиска
- В Java есть 2 вида равенства: `Равенство ссылок` и `Равенство объектов`
- `Равенство ссылок` - это когда две ссылки указывают на один объект в куче
- `Равенство объектов` - это когда два объекта в куче по разным адресам, но идентичны
- HashSet наследует методы hashCode() и equals() от Object который устроен на "равенстве ссылок"
- В Object hashCode формируется из адреса памяти в куче
- Поэтому hashCode будут формироваться разными для похожих объектов
- Чтобы HashSet не содержал дубликатов "по одержимому" - нужно их переопределить
- Эти методы срабатывают при добавлении объектов в HashSet
- Одинаковые хэш-коды не гарантируют что объекты равны (алгоритм hashCode() может выдать одинаковый результат для разных объектов)
- Дополнительно вызывается equals() для точного определения
- [Класс Song с переопределенными методами equals и hashCode()](src%2FHashSet%2FSongV3.java)