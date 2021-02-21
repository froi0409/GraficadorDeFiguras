package com.froi.graficador.parser;
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.ArrayList;
import com.froi.graficador.lexer.*;
import com.froi.graficador.entidades.Advertencia;
import com.froi.graficador.entidades.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(Scanner s, SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\036\000\002\002\004\000\002\002\004\000\002\002" +
    "\002\000\002\003\003\000\002\003\004\000\002\004\005" +
    "\000\002\004\005\000\002\004\005\000\002\004\005\000" +
    "\002\004\005\000\002\007\013\000\002\007\004\000\002" +
    "\010\015\000\002\010\004\000\002\011\017\000\002\014" +
    "\002\000\002\011\005\000\002\005\010\000\002\005\004" +
    "\000\002\006\007\000\002\013\003\000\002\013\003\000" +
    "\002\012\004\000\002\012\005\000\002\012\005\000\002" +
    "\012\005\000\002\012\005\000\002\012\003\000\002\012" +
    "\005\000\002\012\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\131\000\006\002\uffff\004\005\001\002\000\004\002" +
    "\133\001\002\000\014\005\054\006\055\007\051\010\053" +
    "\011\052\001\002\000\012\002\ufffe\003\013\004\ufffe\015" +
    "\011\001\002\000\006\002\uffff\004\005\001\002\000\004" +
    "\002\000\001\002\000\004\016\015\001\002\000\006\002" +
    "\ufffd\004\ufffd\001\002\000\004\013\014\001\002\000\006" +
    "\002\uffef\004\uffef\001\002\000\004\017\016\001\002\000" +
    "\004\012\017\001\002\000\012\003\022\012\024\021\020" +
    "\023\021\001\002\000\016\013\uffe6\014\uffe6\022\uffe6\023" +
    "\uffe6\024\uffe6\025\uffe6\001\002\000\012\003\022\012\024" +
    "\021\020\023\021\001\002\000\004\013\047\001\002\000" +
    "\014\014\041\022\030\023\031\024\034\025\033\001\002" +
    "\000\012\003\022\012\024\021\020\023\021\001\002\000" +
    "\004\013\026\001\002\000\006\002\ufff0\004\ufff0\001\002" +
    "\000\014\013\032\022\030\023\031\024\034\025\033\001" +
    "\002\000\012\003\022\012\024\021\020\023\021\001\002" +
    "\000\012\003\022\012\024\021\020\023\021\001\002\000" +
    "\016\013\uffe5\014\uffe5\022\uffe5\023\uffe5\024\uffe5\025\uffe5" +
    "\001\002\000\012\003\022\012\024\021\020\023\021\001" +
    "\002\000\012\003\022\012\024\021\020\023\021\001\002" +
    "\000\016\013\uffe8\014\uffe8\022\uffe8\023\uffe8\024\uffe8\025" +
    "\uffe8\001\002\000\016\013\uffe7\014\uffe7\022\uffe7\023\uffe7" +
    "\024\uffe7\025\uffe7\001\002\000\016\013\uffe9\014\uffe9\022" +
    "\uffe9\023\uffe9\024\034\025\033\001\002\000\016\013\uffea" +
    "\014\uffea\022\uffea\023\uffea\024\034\025\033\001\002\000" +
    "\012\003\022\012\024\021\020\023\021\001\002\000\014" +
    "\014\043\022\030\023\031\024\034\025\033\001\002\000" +
    "\006\010\046\020\044\001\002\000\004\013\uffec\001\002" +
    "\000\004\013\uffee\001\002\000\004\013\uffed\001\002\000" +
    "\016\013\uffe4\014\uffe4\022\uffe4\023\uffe4\024\uffe4\025\uffe4" +
    "\001\002\000\016\013\uffeb\014\uffeb\022\uffeb\023\uffeb\024" +
    "\uffeb\025\uffeb\001\002\000\006\003\074\012\075\001\002" +
    "\000\006\003\111\012\112\001\002\000\006\003\074\012" +
    "\075\001\002\000\006\003\056\012\057\001\002\000\006" +
    "\003\056\012\057\001\002\000\004\013\071\001\002\000" +
    "\012\003\022\012\024\021\020\023\021\001\002\000\012" +
    "\002\ufffb\003\ufffb\004\ufffb\015\ufffb\001\002\000\014\014" +
    "\062\022\030\023\031\024\034\025\033\001\002\000\012" +
    "\003\022\012\024\021\020\023\021\001\002\000\014\014" +
    "\064\022\030\023\031\024\034\025\033\001\002\000\012" +
    "\003\022\012\024\021\020\023\021\001\002\000\014\014" +
    "\066\022\030\023\031\024\034\025\033\001\002\000\004" +
    "\026\067\001\002\000\004\013\070\001\002\000\012\002" +
    "\ufff7\003\ufff7\004\ufff7\015\ufff7\001\002\000\012\002\ufff6" +
    "\003\ufff6\004\ufff6\015\ufff6\001\002\000\012\002\ufffc\003" +
    "\ufffc\004\ufffc\015\ufffc\001\002\000\012\002\ufff9\003\ufff9" +
    "\004\ufff9\015\ufff9\001\002\000\004\013\110\001\002\000" +
    "\012\003\022\012\024\021\020\023\021\001\002\000\014" +
    "\014\077\022\030\023\031\024\034\025\033\001\002\000" +
    "\012\003\022\012\024\021\020\023\021\001\002\000\014" +
    "\014\101\022\030\023\031\024\034\025\033\001\002\000" +
    "\012\003\022\012\024\021\020\023\021\001\002\000\014" +
    "\014\103\022\030\023\031\024\034\025\033\001\002\000" +
    "\012\003\022\012\024\021\020\023\021\001\002\000\014" +
    "\014\105\022\030\023\031\024\034\025\033\001\002\000" +
    "\004\026\106\001\002\000\004\013\107\001\002\000\012" +
    "\002\ufff5\003\ufff5\004\ufff5\015\ufff5\001\002\000\012\002" +
    "\ufff4\003\ufff4\004\ufff4\015\ufff4\001\002\000\004\013\ufff2" +
    "\001\002\000\012\003\022\012\024\021\020\023\021\001" +
    "\002\000\012\002\ufff8\003\ufff8\004\ufff8\015\ufff8\001\002" +
    "\000\014\014\115\022\030\023\031\024\034\025\033\001" +
    "\002\000\012\003\022\012\024\021\020\023\021\001\002" +
    "\000\014\014\117\022\030\023\031\024\034\025\033\001" +
    "\002\000\012\003\022\012\024\021\020\023\021\001\002" +
    "\000\014\014\121\022\030\023\031\024\034\025\033\001" +
    "\002\000\012\003\022\012\024\021\020\023\021\001\002" +
    "\000\014\014\123\022\030\023\031\024\034\025\033\001" +
    "\002\000\012\003\022\012\024\021\020\023\021\001\002" +
    "\000\014\014\125\022\030\023\031\024\034\025\033\001" +
    "\002\000\004\026\126\001\002\000\004\013\127\001\002" +
    "\000\012\002\ufff3\003\ufff3\004\ufff3\015\ufff3\001\002\000" +
    "\004\013\131\001\002\000\012\002\ufff1\003\ufff1\004\ufff1" +
    "\015\ufff1\001\002\000\012\002\ufffa\003\ufffa\004\ufffa\015" +
    "\ufffa\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\131\000\010\002\003\003\006\004\005\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\005\011\001\001" +
    "\000\010\002\007\003\006\004\005\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\006\024\012\022\001\001\000\002\001\001\000\004" +
    "\012\047\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\012\026\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\012\037\001\001\000\004\012" +
    "\036\001\001\000\002\001\001\000\004\012\035\001\001" +
    "\000\004\012\034\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\012\041" +
    "\001\001\000\002\001\001\000\004\013\044\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\010\131\001\001\000" +
    "\004\011\112\001\001\000\004\010\072\001\001\000\004" +
    "\007\071\001\001\000\004\007\057\001\001\000\002\001" +
    "\001\000\004\012\060\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\012\062\001\001\000\002\001\001\000" +
    "\004\012\064\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\012\075\001\001\000\002\001\001\000\004\012\077\001" +
    "\001\000\002\001\001\000\004\012\101\001\001\000\002" +
    "\001\001\000\004\012\103\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\014\127\001\001\000\004\012\113\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\012\115" +
    "\001\001\000\002\001\001\000\004\012\117\001\001\000" +
    "\002\001\001\000\004\012\121\001\001\000\002\001\001" +
    "\000\004\012\123\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public Symbol do_action(
    int                        act_num,
    lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    private ArrayList<Figura> graficaciones;
    private ArrayList<String> errores;
    private ArrayList<Advertencia> listaErrores;
    private String colorF;
    private int[] v;

    public parser(GraficadorLex lex, ArrayList<Advertencia> listaErrores) {
        super(lex);
        //Desclaramos las listas que utilizaremos
        graficaciones = new ArrayList<>();
        errores = new ArrayList<>();
        v = new int[5];
        v[0] = 0;
        v[1] = 0;
        v[2] = 0;
        v[3] = 0;
        v[4] = 0;
        this.listaErrores = listaErrores;
    }
    public void report_error(String message, Object info) {
        System.out.println("reporterror");
    }
    public void report_fatal_error(String message, Object info) {
        System.out.println("reportfatal " + info);
    }
    public void syntax_error(Symbol s) {
        System.out.println("Cadena inválida en la fila: " + (s.left) + " columna: " + s.right + " descripción: no se esperaba la expresión");
    }

    //Obtenemos las listas
    public ArrayList<Figura> getGraficaciones() {
        return graficaciones;
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws Exception
    {
      /* Symbol object for return from actions */
      Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= texto EOF 
            {
              Object RESULT =null;
		int start_valleft = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // texto ::= instruccion texto 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("texto",0, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // texto ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("texto",0, ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // instruccion ::= graficacion 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",1, ((Symbol)CUP$parser$stack.peek()), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instruccion ::= graficacion animacion 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",1, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // graficacion ::= GRAFICAR CIRCULO reglaGraficacionCuatro 
            {
              Object RESULT =null;
		 graficaciones.add(new Circulo(v[0], v[1], v[2], colorF)); System.out.println("CIRCULO\n"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("graficacion",2, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // graficacion ::= GRAFICAR CUADRADO reglaGraficacionCuatro 
            {
              Object RESULT =null;
		 graficaciones.add(new Cuadrado(v[0], v[1], v[2], colorF)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("graficacion",2, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // graficacion ::= GRAFICAR RECTANGULO reglaGraficacionCinco 
            {
              Object RESULT =null;
		 graficaciones.add(new Rectangulo(v[0], v[1], v[2], v[3], colorF)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("graficacion",2, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // graficacion ::= GRAFICAR LINEA reglaGraficacionCinco 
            {
              Object RESULT =null;
		 graficaciones.add(new Linea(v[0], v[1], v[2], v[3], colorF)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("graficacion",2, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // graficacion ::= GRAFICAR POLIGONO reglaGraficacionSeis 
            {
              Object RESULT =null;
		 graficaciones.add(new Poligono(v[0], v[1], v[2], v[3], v[4], colorF));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("graficacion",2, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // reglaGraficacionCuatro ::= PARA valor COM valor COM valor COM COLOR PARC 
            {
              Object RESULT =null;
		int v1left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).left;
		int v1right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).right;
		Double v1 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		int v2left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int v2right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Double v2 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int v3left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int v3right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Double v3 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int nomColorleft = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nomColorright = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String nomColor = (String)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 colorF = (String)nomColor; v[0]=v1.intValue(); v[1]=v2.intValue(); v[2]=v3.intValue(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("reglaGraficacionCuatro",5, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // reglaGraficacionCuatro ::= error PARC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("reglaGraficacionCuatro",5, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // reglaGraficacionCinco ::= PARA valor COM valor COM valor COM valor COM COLOR PARC 
            {
              Object RESULT =null;
		int v1left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).left;
		int v1right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).right;
		Double v1 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-9)).value;
		int v2left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).left;
		int v2right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).right;
		Double v2 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		int v3left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int v3right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Double v3 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int v4left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int v4right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Double v4 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int nomColorleft = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nomColorright = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String nomColor = (String)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 colorF = (String)nomColor; v[0]=v1.intValue(); v[1]=v2.intValue(); v[2]=v3.intValue(); v[3]=v4.intValue(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("reglaGraficacionCinco",6, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // reglaGraficacionCinco ::= error PARC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("reglaGraficacionCinco",6, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // reglaGraficacionSeis ::= PARA valor COM valor COM valor COM valor COM valor COM COLOR PARC 
            {
              Object RESULT =null;
		int v1left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)).left;
		int v1right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)).right;
		Double v1 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-11)).value;
		int v2left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).left;
		int v2right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).right;
		Double v2 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-9)).value;
		int v3left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).left;
		int v3right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).right;
		Double v3 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		int v4left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int v4right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Double v4 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int v5left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int v5right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Double v5 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int nomColorleft = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nomColorright = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String nomColor = (String)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 colorF = (String)nomColor; v[0]=v1.intValue(); v[1]=v2.intValue(); v[2]=v3.intValue(); v[3]=v4.intValue(); v[4]=v5.intValue(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("reglaGraficacionSeis",7, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // NT$0 ::= 
            {
              Object RESULT =null;
 System.out.println("Error en regla de graficación seis"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",10, ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // reglaGraficacionSeis ::= error NT$0 PARC 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("reglaGraficacionSeis",7, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // animacion ::= ANIMAR OBJETO ANTERIOR PARA reglaAnimacion PARC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("animacion",3, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // animacion ::= error PARC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("animacion",3, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // reglaAnimacion ::= valor COM valor COM tipoAnimacion 
            {
              Object RESULT =null;
		int v1left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int v1right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Double v1 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int v2left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int v2right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double v2 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int animationleft = ((Symbol)CUP$parser$stack.peek()).left;
		int animationright = ((Symbol)CUP$parser$stack.peek()).right;
		String animation = (String)((Symbol) CUP$parser$stack.peek()).value;
		 
                                                                int lastElement = graficaciones.size()-1;
                                                                Figura figure = graficaciones.get(lastElement);
                                                                figure.setAnimacion(true);
                                                                figure.setPax(v1.intValue());
                                                                figure.setPay(v2.intValue());
                                                                figure.setTipoAnimacion(animation.toString());
                                                                System.out.println("\n\n\nAnimacion en : " + figure.getPax() + "  " + figure.getPay() + "   " + figure.getTipoAnimacion() + "\n" + "Objeto a animar: " + figure + "\n\n\n");
                                                            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("reglaAnimacion",4, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // tipoAnimacion ::= LINEA 
            {
              String RESULT =null;
		 RESULT="linea"; System.out.println("Se encontró animación con linea"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipoAnimacion",9, ((Symbol)CUP$parser$stack.peek()), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // tipoAnimacion ::= CURVA 
            {
              String RESULT =null;
		 RESULT="curva"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipoAnimacion",9, ((Symbol)CUP$parser$stack.peek()), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // valor ::= SIGMENOS valor 
            {
              Double RESULT =null;
		int valo1left = ((Symbol)CUP$parser$stack.peek()).left;
		int valo1right = ((Symbol)CUP$parser$stack.peek()).right;
		Double valo1 = (Double)((Symbol) CUP$parser$stack.peek()).value;
		 RESULT=valo1*-1; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valor",8, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // valor ::= valor SIGSUMA valor 
            {
              Double RESULT =null;
		int valo1left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int valo1right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double valo1 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int valo2left = ((Symbol)CUP$parser$stack.peek()).left;
		int valo2right = ((Symbol)CUP$parser$stack.peek()).right;
		Double valo2 = (Double)((Symbol) CUP$parser$stack.peek()).value;
		 RESULT=valo1+valo2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valor",8, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // valor ::= valor SIGMENOS valor 
            {
              Double RESULT =null;
		int valo1left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int valo1right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double valo1 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int valo2left = ((Symbol)CUP$parser$stack.peek()).left;
		int valo2right = ((Symbol)CUP$parser$stack.peek()).right;
		Double valo2 = (Double)((Symbol) CUP$parser$stack.peek()).value;
		 RESULT=valo1-valo2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valor",8, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // valor ::= valor SIGMULTIPLICACION valor 
            {
              Double RESULT =null;
		int valo1left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int valo1right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double valo1 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int valo2left = ((Symbol)CUP$parser$stack.peek()).left;
		int valo2right = ((Symbol)CUP$parser$stack.peek()).right;
		Double valo2 = (Double)((Symbol) CUP$parser$stack.peek()).value;
		 RESULT=valo1*valo2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valor",8, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // valor ::= valor SIGDIVISION valor 
            {
              Double RESULT =null;
		int valo1left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int valo1right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double valo1 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int valo2left = ((Symbol)CUP$parser$stack.peek()).left;
		int valo2right = ((Symbol)CUP$parser$stack.peek()).right;
		Double valo2 = (Double)((Symbol) CUP$parser$stack.peek()).value;
		 RESULT=valo1/valo2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valor",8, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // valor ::= NUMERO 
            {
              Double RESULT =null;
		int valo1left = ((Symbol)CUP$parser$stack.peek()).left;
		int valo1right = ((Symbol)CUP$parser$stack.peek()).right;
		String valo1 = (String)((Symbol) CUP$parser$stack.peek()).value;
		 RESULT= new Double(valo1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valor",8, ((Symbol)CUP$parser$stack.peek()), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // valor ::= PARA valor PARC 
            {
              Double RESULT =null;
		int valo1left = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int valo1right = ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double valo1 = (Double)((Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT= new Double(valo1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("valor",8, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // valor ::= error PARC 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("valor",8, ((Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
