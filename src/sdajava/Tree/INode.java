package sdajava.Tree;

import java.util.LinkedList;

/**
 * Created by Andrzej on 13.03.2017.
 */
public interface INode <T> {  // <> oznaczamy generyki

    public Node<T> getParent(); //Zwracamy rodzica
    public void setParent(Node<T> parent); // ustawienie wezla rodzica
    public T getData(); //pobranie przechowywanych danych
    public  void setData(T data);  // ustawianie danych
    public int getDegree(); // zwraca stopien wezla
    public Node<T> getChild(int id); // zwraca obiekt dziecka o danym identyfikatorze
    public boolean isLeaf(); // sprawdza czy wezel jest lisciem
    public Node<T> addChild(Node<T> add); // dodanie do wezla dziecka
    public Node<T> addChildData(T data); // dodaje dane do dziecka
    public Node<T> removeChild(int id); // usuwanie dziecka
    public LinkedList<Node<T>> getChildren(); //zwraca liste dzieci
    public String toString(); //wyswietla dane

}
// obiekt klasy Node T przechwuje zmienne
// a samo T to jest sama zmienna