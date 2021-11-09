package ru.avalon.javapp.devj110.doublyLinkedList;

public class DoublyLinkedList implements Cloneable{
    private Element head;
    private Element tail;  

    
    public void addToHead(int value){ //Добавление в начало 
        if (head != null) {
            Element newElement = new Element();
            newElement.data = value;
            newElement.child = head;
            head.parent = newElement;
            head = newElement;
        } else {
            head = tail = new Element();
            head.data = value;
        }       
    }
    
    
    public int peekFromHead(){ //Получение значения первого элемента    
        if (head == null){
        throw new NullPointerException("В списке нет элементов");
        }
        return head.data;
                }  
   
    
    public int peekRemoveFromHead(){ //получение и удаление первого элемента
        if (head == null){
            throw new NullPointerException("В списке нет элементов"); 
        }
        Element tempElement = head;
        if (head==tail){
          head=tail=null;
          }
        if (head != tail) {
            head = head.child;
            head.parent=null;
        }
        return tempElement.data;
        }    
        
    public void addToTail(int value){ //Добавление элемента в конец 
        if (head != null) {
            Element newElement = new Element();
            newElement.data = value;
            newElement.parent = tail;
            tail.child = newElement;
            tail = newElement;
        } else {
            head = tail = new Element();
            head.data = value;
        }       
    }
    
        public int peekFromTail(){
        if (head == null){
        throw new NullPointerException("В списке нет элементов");
        }
        return tail.data;
    }

     public int peekRemoveFromTail(){ //получение и удаление последнего элемента
        if (tail == null){
            throw new NullPointerException("В списке нет элементов"); 
        }
        Element tempElement = tail;
        if (head != tail){
            tail = tail.parent;
            tail.child=null;
        }
        else { 
            head = tail = null;
        }
        return tempElement.data;
        }    
    
    
        public boolean find (int value){  //поиск значения, возвращает boolean
        Element tempElement = head;
        while (tempElement!=null){
        if (tempElement.data == value){
        return true;}    
        tempElement = tempElement.child;
        }
        return false; 
    }  
    
        public boolean isEmpty() { //список пуст
        return head == null;
    }    
    
    public int length (){//размер списка
    int length = 0;
    Element tempElement = head;
    if (isEmpty()){
        return length;
    }
    else{
        while (tempElement!=null)
            {tempElement = tempElement.child;
            length++;
            }
        }
    return length;        
    }
        
public void remove(int value){ //удаление эленмента, содержащего заданное значение

    Element tempElement = head;
    Element prevElement = tempElement.parent;

    if (head == null){
        return;
        }
    if (head.data == value){
        head=head.child;
        head.parent=null;}
    else {
            while (tempElement!=null){
                if (tempElement.data != value) {
                    prevElement=tempElement; 
                    tempElement=tempElement.child;
                                               }
                else {
                    prevElement.child = tempElement.child;
                    tempElement=tempElement.child;

                     }
                                            }
         }
}
  

public void addArrayToHead(int[] array){
    for(int i = array.length-1; i >=0 ;i--){
        addToHead(array[i]);
    }
}

public void addArrayToTail(int[] array){
    for(int i = 0; i < array.length ;i++){
        addToTail(array[i]);
    }
}



public void addListToHead (DoublyLinkedList list){
    if (head != null){
        list.tail.child = head;
        head.parent = list.tail;
        head=list.head;
    }   
}

public void addListToTail (DoublyLinkedList list){
    if (list.isEmpty()==false){
        list.head.parent = tail;
        tail.child = list.head;     
        tail=list.tail;      
    }   
}


    
            public String printFromStart (){
            if  (head != null) {
        String line = "";
        Element tempElement = head;
        while (tempElement!=null){
            line = line + " " + tempElement.data;
            tempElement = tempElement.child;
        }
        return line;
        
    }
    else return "Список пуст";
            }
            
      public String printFromEnd (){
            if  (head != null) {
        String line = "";
        Element tempElement = tail;
        while (tempElement!=null){
            line = line + " " + tempElement.data;
            tempElement = tempElement.parent;
        }
        return line;
        
    }
    else return "Список пуст";
            } 
    
}

