public class Main {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        drinks.addChild(cold); drinks.addChild(hot);
        TreeNode tea = new TreeNode("tea");
        TreeNode coffee = new TreeNode("coffee");
        hot.addChild(coffee); hot.addChild(tea); 
        TreeNode nonAlcohol = new TreeNode("nonAlcohol");
        TreeNode alcohol = new TreeNode("alcohol");
        cold.addChild(nonAlcohol); cold.addChild(alcohol);
        TreeNode pepsi = new TreeNode("pepsi");
        TreeNode bear = new TreeNode("bear");
        nonAlcohol.addChild(pepsi);
        alcohol.addChild(bear);

        System.out.println(drinks.print(0));

    }
}
