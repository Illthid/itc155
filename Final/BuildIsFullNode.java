public class buildIsFullNode {
    public int data;
    public buildIsFullNode left;
    public buildIsFullNode right;

    public buildIsFullNode(int data) {
        this(data,null,null);
    }

    public buildIsFullNode(int data, buildIsFullNode left, buildIsFullNode right) {
        this.data=data;
        this.left=left;
        this.right=right;
    }


}
