package ch02.list;

public class MyLinkedList {
    // inner 클래스 정의
    private class Node {
        /**
         * 저장할 객체
         */
        private Object data;

        /**
         * 연결된 다음 노드를 참조하는 변수
         */
        private Node nextNode;

        Node(Object data){
            this.data = data;
            this.nextNode = null;
        }
    }

    /**
     * 첫번째 노드
     */
    private Node header;
    /**
     * 전체 요소의 수
     */
    private int size;

    public MyLinkedList(){
        header = new Node(null);
    }

    /**
     * data를 첫번째 요소로 추가한다.
     * @param data 추가할 요소
     */
    public void appendFirst(Object data){
        Node node = new Node(data);
        // 헤더가 가리키고 있는 첫번째 노드의 주소를 삽입한 노드의 nextNode로 지정
        node.nextNode = header.nextNode;
        // 헤더의 첫번째 노드를 새로 생성한 노드로 지정
        header.nextNode = node;
        size++;
    }

    /**
     * data를 index 위치에 삽입한다.
     * @param index data가 삽입될 위치
     * @param data 삽입할 데이터
     */
    public void appendTo(int index, Object data){
        if(index == 0){
            appendFirst(data);
        }else{
            Node newNode = new Node(data); // 추가할 새로운 노드
            Node pNode = getNode(index);
            Node nNode = pNode.nextNode;
            newNode.nextNode = nNode;
            pNode.nextNode = newNode;

        }
    }

    /**
     * data를 리스트의 마지막에 추가한다.
     * @param data 추가할 데이터
     */
    public void appendTo(Object data){
        appendTo(size, data);
    }
    

    /**
     * index 위치의 Node를 찾아서 반환한다.
     * @param index 찾을 index
     * @return 찾아낸 Node
     */
    private Node getNode(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node node = header.nextNode;
        for(int i=0; i<index; i++){
            node = node.nextNode;
        }
        return node;
    }
}











