package com.the.array;

public class Test1 {

	public static void main(String[] args) {
		Tree treeList[] = {new Tree(),
		new Tree(),
		new Tree(),
		new Tree()
		};
	treeList[0].name = "망고";
	treeList[0].cost = 10;
	treeList[0].height = 15550.223123123;
	treeList[0].ownerName = "김상식";
	treeList[1].name = "사과";
	treeList[1].cost = 101;
	treeList[1].height = 122250.223123123;
	treeList[1].ownerName = "김준식";
	treeList[2].name = "은행";
	treeList[2].cost = 10131232;https://marketplace.eclipse.org/marketplace-client-intro?mpc_install=5590071
	treeList[2].height = 11.223123123;
	treeList[2].ownerName = "김강식";
	treeList[3].name = "소나무";
	treeList[3].cost = 545;
	treeList[3].height = 100.223123123;
	treeList[3].ownerName = "김민식";
	
	for(Tree tree:treeList) {
		System.out.println("나무 이름은 "+tree.name);
		System.out.println("나무 비용은 "+tree.cost);
		System.out.println("나무 키는 "+tree.height);
		System.out.println("나무 주인이름은 "+tree.ownerName);
	}
		

	}
}
class Tree{
	public String name;
	public int cost;
	public double height;
	public String ownerName;

}
