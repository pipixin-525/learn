package code016;

public class Demo130Generic<E> {

    private E name;

    public Demo130Generic() {
    }

    public Demo130Generic(E name) {
        this.name = name;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
