
package ru.avalon.javapp.devj110.doublyLinkedList;


public class Main {


    public static void main(String[] args) {

        System.out.println("Двусязный список содержит значения:");
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToHead(0);
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        list.addToTail(4);
        list.addToTail(5);
        list.addToTail(6);
        System.out.println(list.printFromStart());
        
        System.out.println("Первый элемент: " + list.peekFromHead());
        System.out.println("Последний элемент: " + list.peekFromTail());
        System.out.println("Вывод первго элемента с удалением из списка: "
                + list.peekRemoveFromHead());
        System.out.println(list.printFromStart());
         System.out.println("Вывод последнего элемента с удалением из списка: "
                + list.peekRemoveFromTail());
        System.out.println(list.printFromStart());
        System.out.println("Список содержит заданное число: " + list.find(6));
        System.out.println("Список пуст: " + list.isEmpty());
        System.out.println("Длина списка: " + list.length());
        System.out.println("Удаление элемента, содержащего заданное значение");
        System.out.println(list.printFromStart());
        list.remove(2);
        System.out.println(list.printFromStart());
        list.addArrayToHead(new int[] {123, 456, 789});
        System.out.println(list.printFromStart());
        list.addArrayToTail(new int[] {987, 654, 321});
        System.out.println(list.printFromStart());
        
        DoublyLinkedList list1 = new DoublyLinkedList();
        list1.addToHead(89);
        list1.addToHead(35);
        list1.addToHead(48);
        
        System.out.println("Список для добавления в начало основного списка: " + list1.printFromStart());        
        list.addListToHead(list1);
        System.out.println("Добавление списка в начало основного списка: " + list.printFromStart());
        System.out.println();
        
        
        DoublyLinkedList list2 = new DoublyLinkedList();
        list2.addToHead(54);
        list2.addToHead(64);
        list2.addToHead(86);
        System.out.println("Список для добавления в конец основного списка: " + list2.printFromStart());        

        list.addListToTail(list2);
        System.out.println("Добавление списка в конец основного списка: " + list.printFromStart());

        System.out.println("Реверсивная печать списка: " + list.printFromEnd());
   

    }
    
}
