package main.lexer;
/***
 * @author 毕修平
 * Tag值
 */
public class Tag {
    /**
     *  statement=0,condition=1,declare=2,assign=3 block=4
     *  true, false, bool ,string
     * if，else，while,int real，char,print
     *  scan， break，continue,for
     * 减，乘，除，赋值，小于，大于
     * 不等于，等于，大于等于，小于等于,或，与，加，按位或，按位与
     * 整数，实数，字符, 字符串
     * 分隔符(左括号，右括号，左大括号，右大括号，左中括号，右中括号，分号,引号),标识符 正号 负号
     * */
    public final static int STATEMENT=0,CONDITION=1,DECLARE=2,ASSIGN_STA=3,BLOCK=4,
                            TRUE=252,FALSE=253,BOOL=254,STRING=255,
                            IF=256, ELSE=257, WHILE=258,INT=259, REAL=260, CHAR=261,PRINT =262,
                            SCAN =263, BREAK=264,CONTINUE=265,FOR=266,
                            SUB=267, MUL=268, DIVIDE=269, ASSIGN =270, LESS=271, GREATER=272,
                            UE=273,  EQ=274, GE=275, LE=276,OR=278,AND=279,ADD=280,BAND=281,BOR=282,
                            INTNUM=283,REALNUM=284, CHAR_S=285, STR =286,
                            SEPARATOR =287,ID=288,NEG=289,POS=290;



    public static String getValue(int i){
        if (i>=252 && i<=266)
            return "关键字";
        else if (i>=267 && i<=282 )
            return "运算符";
        else if (i==283)
            return "整数";
        else if (i==284)
            return "实数";
        else if (i==285)
            return "字符";
        else if (i==287)
            return "分隔符";
        else if (i==288)
            return "标识符";
        else if (i==286)
            return "字符串";
        else if (i==289)
            return "负号";
        else if (i==290)
            return "正号";
        else
            return "";
    }


}
