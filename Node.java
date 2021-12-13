import java.util.List;
import java.util.ArrayList;

public class Node
{
    private List<Node> children = null;
    private List<Node> parents = null;
    private String value;

    public Node(String value)
    {
        this.children = new ArrayList<>();
        this.value = value;
    }

    public void addChild(Node child)
    {
        children.add(child);
    }

}