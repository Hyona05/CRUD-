package uz.app.col;

import java.util.Objects;

public class Elements {
    Object[] elements = new Object[5];

    int size = 5;
    public int length = 0;

    public void add(Object obj){
        if (length==size){
            Object[] newObject = new Object[size*2];
            System.arraycopy(elements,0,newObject,0,length);
            elements = newObject;
            size = size*2;
        }
        elements[length] = obj;
        length++;
    }

    public void print(){
        StringBuilder sb =new StringBuilder("[\n");
        for (int i = 0; i < length; i++) {
            sb
                    .append(elements[i])
                    .append(i<length-1?", \n":"\n]");
        }
        System.out.println(sb.toString());
    }
    public Object getElement(int index){
        int i = Objects.checkIndex(index, length);
        return elements[i];
    }

    public void delete(int index){
        int i = Objects.checkIndex(index, length);
        for (int j = i; j < length-1; j++) {
            elements[j]=elements[j+1];
        }
        length--;
    }

    @Override
    public String toString() {
        StringBuilder item=new StringBuilder();
        for (int i = 0; i < length; i++) {
            item
                    .append( elements[i])
                    .append(i<length-1?",\n":"\n");
        }
        return "Elements{" +
                "elements=\n" + item +
                "size=" + size +
                ", length=" + length +
                '}';
    }
}
