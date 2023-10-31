public class StackX {
    private final int maxSize;
    private final long[] stackArray;
    private int top; // Вершина стека

    //--------------------------------------------------------------
    public StackX(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1; // Пока нет ни одного элемента
    }

    //--------------------------------------------------------------
    public void push(long j) { // Размещение элемента на вершине стека
        stackArray[++top] = j; // Увеличение top, вставка элемента
    }

    //--------------------------------------------------------------
    public long pop() {
        return stackArray[top--];
    }

    //--------------------------------------------------------------
    public long peek() { // Чтение элемента с вершины стека
        return stackArray[top];
    }

    //--------------------------------------------------------------
    public boolean isEmpty() { // True, если стек пуст
        return (top == -1);
    }

    //--------------------------------------------------------------
    public boolean isFull() { // True, если стек полон
        return (top == maxSize - 1);
    }
}