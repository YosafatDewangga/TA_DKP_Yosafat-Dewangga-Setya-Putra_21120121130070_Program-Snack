/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.akhir;

/**
 *
 * @author Yosafat
 */
public class stuck {
    public int capacity;
    public Object[]data;
    public int top;
    public int count;


    public stuck(int size){
        top = -1;
        data = new Object[size];
        capacity = size;
        count = 0;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(Object x){
        if(isFull()){
            System.out.println("Pesanan penuh");
        }else{
            System.out.println("Memasukkan " + x + " Ke Dalam pesanan");
            data[++top] = x;
        }
    }

    public Object pop(){
        if(isEmpty()){
            System.out.println("Pesanan Kosong!!!");
            return 0;
        }
        System.out.println("Mengeluarkan " + data[top] + " Dari Stack");
        return data[top--];
    }

    public void printStack(){
        System.out.print("Data Dalam Stack : ");
        if(isEmpty()){
            System.out.println("Stack Kosong!!!");
        }else{
            for(int i = top; i >= 0; i--){
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }




    public void peek(){
        if(isEmpty()){
            System.out.println("Stack Kosong!!!");
        }else{
            System.out.println("Data Teratas : " + data[top]);
        }
    }

    public void clear(){
        if(isEmpty()){
            System.out.println("Stack Kosong!!!");
        }else{
            top = -1;
        }
    }

    public void count(){
        System.out.println("Jumah Data Dalam Stack : " + (top + 1));
    }

}

