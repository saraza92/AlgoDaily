import java.util.*;

class Solution{

    static class Node{
        char letter;
        int count;

        Map<Character,Node> nextLetters;
        public Node(char letter){
            this.letter=letter;
            count=1;
            this.nextLetters= new HashMap<>();
        }
        public Node(){
            this.nextLetters= new HashMap<>();
        }
    }

    public static List<Integer> contacts(List<List<String>> queries) {
        List<Integer> numberOfContacts = new ArrayList<>();
        if(queries==null||queries.size()==0)
            return numberOfContacts;

        int count = 0;
        Node root= new Node();
        for(List<String> query:queries){
            if(query.get(0).equals("add")) {
                count++;
                root = addContact(root, query.get(1));
            }
            if(query.get(0).equals("find")){
                if(query.get(1).equals("")){
                    numberOfContacts.add(count);
                }else{
                    numberOfContacts.add(findContact(root,query.get(1)));
                }
            }
        }
        return numberOfContacts;
    }

    public static Node addContact ( Node root, String s){
        if(s.length()==0)
            return root;
        Node node;
        if(root.nextLetters.containsKey(s.charAt(0))){
            node = root.nextLetters.get(s.charAt(0));
            node.count++;
        }
        else{
            root.nextLetters.put(s.charAt(0),new Node(s.charAt(0)));
        }
        node = addContact(root.nextLetters.get(s.charAt(0)),s.substring(1));
        root.nextLetters.put(s.charAt(0),node);
        return root;
    }

    public static int findContact( Node root , String s) {
        Node node = root;
        for (int i = 0; i < s.length(); i++) {

            if (node.nextLetters.get(s.charAt(i)) == null)
                return 0;
            else
                node = node.nextLetters.get(s.charAt(i));
        }
        return node.count;
    }
}

public class PhonBookTreeSearch{
    public static void main(String[] args) {
        List<List<String>> queries = new ArrayList<>();
        List<String> query = Arrays.asList("add","anwar");
        queries.add(query);
        query=Arrays.asList("add","anwra");
        queries.add(query);
        query=Arrays.asList("add","anwrr");
        queries.add(query);
        query=Arrays.asList("add","anwre");
        queries.add(query);
        query=Arrays.asList("add","anrra");
        queries.add(query);
        query=Arrays.asList("add","nermeen");
        queries.add(query);
        query=Arrays.asList("find","anw");
        queries.add(query);
        System.out.print(Solution.contacts(queries));

    }
}
