class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> li = new ArrayList<>();
        for(String i:words){
            i+=Character.toString(separator);
            String str = "";
            for(int j = 0;j<i.length();j++){
                if(i.substring(j,j+1).equals(Character.toString(separator))){
                    if(str.length()>0){
                    li.add(str);}
                    str="";
                }
                else{
                    str+=i.substring(j,j+1);
                }
            }
        }
        return li;
    }
}