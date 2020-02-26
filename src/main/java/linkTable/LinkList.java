package linkTable;

public class LinkList {
    private int size;
    private Node node =new Node();
  public void add(Object object,int s){
    Node n=node;
    for (int i=0;i<s;i++){
        n=node.node;
    }
      Node node = new Node();
      node.object=object;
    node.node=n.node;
    n.node=node;

    size++;
  }
  public Object get(int j){
      Node n=node;
      for (int i=0;i<=j;i++){
          n=node.node;
      }
      return n.object;
  }
}
