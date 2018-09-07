package com.preemptive.dasho.anttask;
import java.io.*;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.script.*;
public class Main {
    private static String[] arr= new String[2000];
    public static String fileoutput = "";
    public static void main( String[] args ){
        if(args.length == 0){
            System.out.println("No File input!");
        }else{
            File input = new File(args[0]);
            if (input.isFile() == false && !input.getName().endsWith(".txt")){//If the file wasn't a file and wasn't a .txt file
                System.out.println("Incorrect File input! Must be a file that is .txt");
            }else{
                System.out.println("File:" + input.getPath());
                if (readFile(input) == 0){//If it could't read the file
                    System.out.println("Couldn't read file!");
                }else{//Check Length of Array to make sure its open
                    if (arr.length == 0){
                        System.out.println("File was Empty!");
                    }else{
                        File outputDir = new File(arr[0]);
                        if (!outputDir.isDirectory()){
                            System.out.println("First line wasn't an output directory!");
                        }else{
                            for(int idx = 1; idx < arr.length; idx++){
                                if (arr[idx] != null){
                                    File inputFile = new File(arr[idx]);
                                    if (inputFile.isFile() == false && !inputFile.getName().endsWith(".java")){
                                        System.out.println("Skipping: Incorrect File input! Must be a file that is .java");
                                    }else{
                                        if (deobFile(inputFile) == 1){
                                            saveFile(inputFile, outputDir);
                                        }else{
                                            System.out.println("Failed to deob file strings.");
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
    }
    private static int readFile(File input){

        try (BufferedReader br = new BufferedReader(new FileReader(input))) {
            String line;
            int cnt = 0;
            while ((line = br.readLine()) != null) {
                arr[cnt] = line;
                cnt++;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return 0;
        }
        return 1;
    }
    public static String replac(String str, int index, char replace){
        if(str==null){
            return str;
        }else if(index<0 || index>=str.length()){
            return str;
        }
        char[] chars = str.toCharArray();
        chars[index] = replace;
        return String.valueOf(chars);
    }
    private static int countMatches(String input, char chr){
        int cnt = 0;
        for(int idx = 0; idx< input.length(); idx++){
            if (input.charAt(idx) == chr){
                cnt++;
            }
        }
        return cnt;
    }
    private static int deobFile(File input){
        fileoutput = "";
        try {
            System.out.println("Strings Deob for file: " + input.getName());
            FileReader fileReader = new FileReader(input);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("(")){
                    int max = countMatches(line, '(');
                    String temp = line;
                    String x= line;
                    for(int i = 0; i<max; i++){
                    Matcher m = Pattern.compile("\\((.*?)\\)").matcher(x);

                    while(m.find()) {
                        String findd = m.group(1);
                        if (findd.contains("\", ") || findd.contains(", \"")){
                            if (findd.startsWith("\"") || Character.isDigit(findd.charAt(0)) || findd.startsWith("-")){

                                String Segments[] = m.group(1).split(", ");

                                if (Segments.length == 2){
                                    String part1 = Segments[0];
                                    String part2 = Segments[1];
                                    int num = 0;
                                    if (Character.isDigit(part1.charAt(0)) || part1.startsWith("-")){
                                        ScriptEngine e = new ScriptEngineManager().getEngineByName("js");
                                        try{
                                            int res = ((Number)e.eval(part1)).intValue();
                                            num = res;
                                            fileoutput += "\nResult: " + m.group(1);
                                            System.out.println("\nResult: " + m.group(1));
                                            part2 = part2.substring(1, part2.length()-1);
                                            fileoutput += ("\nInput 1: " + num + "\nInput 2: " + part2);
                                            System.out.println("\nInput 1: " + num + "\nInput 2: " + part2);
                                            fileoutput += ("\nOuput: " + com.preemptive.dasho.anttask.b.toString(num, part2));
                                            System.out.println("\nOuput: " + com.preemptive.dasho.anttask.b.toString(num, part2));
                                        }catch(Exception ex){ }
                                    }else{
                                        ScriptEngine e = new ScriptEngineManager().getEngineByName("js");
                                        try{
                                            int res = ((Number)e.eval(part2)).intValue();
                                            num = res;
                                            fileoutput += "\nResult: " + m.group(1);
                                            System.out.println("\nResult: " + m.group(1));
                                            part1 = part1.substring(1, part1.length()-1);
                                            fileoutput += ("\nInput 1: " + part1 + "\nInput 2: " + num);
                                            System.out.println("\nInput 1: " + part1 + "\nInput 2: " + num);
                                            fileoutput += ("\nOuput: " +  com.preemptive.dasho.anttask.a.endsWith(part1, num));
                                            System.out.println("\nOuput: " +  com.preemptive.dasho.anttask.a.endsWith(part1, num));
                                        }catch(Exception ex){}
                                    }
                                }
                            }else if (findd.contains("(")){
                                String og = "";
                                for(int chr = 0; chr< temp.length(); chr++){
                                    if (findd.charAt(chr) == '('){
                                        break;
                                    }else{
                                        og  +=  findd.charAt(chr);
                                    }
                                }
                                x = findd.replace(og, "") + ")";
                            }
                        }
                    }


//
//                            String og = "";
//                            String inner = "";
//                            int first = 0;
//                            boolean rFrst = false;
//
//                            int last = 0;
//                            boolean rLast = false;
//                            for(int chr = 0; chr< temp.length(); chr++){
//                                if (rLast == false){
//                                    og  +=  temp.charAt(chr);
//                                }
//                                if (rFrst == true && rLast == false && temp.charAt(chr) != ')'){
//                                    inner +=  temp.charAt(chr);
//                                }
//                                if (temp.charAt(chr) == '(' && rFrst == false){
//                                    rFrst = true;
//                                    first = chr;
//                                }
//                                if (rFrst == true && rLast == false && temp.charAt(chr) == ')'){
//                                    rLast = true;
//                                    last = chr;
//                                }
//                                if (rFrst && rLast){
//                                    temp = temp.replace(og, "");
//                                    break;
//                                }
//                            }
//                            if (inner.contains("\", ")){
//                                stringBuffer.append(inner);
//                                stringBuffer.append("\n");
//                            }
                    }
                }
            }
            fileReader.close();
           // System.out.println("Contents of file:");
           // System.out.println(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(com.preemptive.dasho.anttask.a.endsWith("\u00162'=\u0019\u0007*6t1=/", 114));
        return 1;
    }
    private static int saveFile(File input, File outputDir){
        String fileName = input.getName();
        try (PrintWriter out = new PrintWriter(outputDir.getAbsoluteFile() + File.separator + fileName)) {
            out.println(fileoutput);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return 1;
    }
}
