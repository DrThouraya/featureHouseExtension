/* Generated By:JavaCC: Do not edit this line. JavaCCParserConstants.java */
/**
 * This file contains the code for JavaCCParser generated
 * by JavaCCParser itself.
 */

package org.javacc.parser;

public interface JavaCCParserConstants {

  int EOF = 0;
  int _OPTIONS = 1;
  int _LOOKAHEAD = 2;
  int _IGNORE_CASE = 3;
  int _PARSER_BEGIN = 4;
  int _PARSER_END = 5;
  int _JAVACODE = 6;
  int _TOKEN = 7;
  int _SPECIAL_TOKEN = 8;
  int _MORE = 9;
  int _SKIP = 10;
  int _TOKEN_MGR_DECLS = 11;
  int _EOF = 12;
  int SINGLE_LINE_COMMENT = 24;
  int FORMAL_COMMENT = 25;
  int MULTI_LINE_COMMENT = 26;
  int ABSTRACT = 28;
  int ASSERT = 29;
  int BOOLEAN = 30;
  int BREAK = 31;
  int BYTE = 32;
  int CASE = 33;
  int CATCH = 34;
  int CHAR = 35;
  int CLASS = 36;
  int CONST = 37;
  int CONTINUE = 38;
  int _DEFAULT = 39;
  int DO = 40;
  int DOUBLE = 41;
  int ELSE = 42;
  int ENUM = 43;
  int EXTENDS = 44;
  int FALSE = 45;
  int FINAL = 46;
  int FINALLY = 47;
  int FLOAT = 48;
  int FOR = 49;
  int GOTO = 50;
  int IF = 51;
  int IMPLEMENTS = 52;
  int IMPORT = 53;
  int INSTANCEOF = 54;
  int INT = 55;
  int INTERFACE = 56;
  int LONG = 57;
  int NATIVE = 58;
  int NEW = 59;
  int NULL = 60;
  int PACKAGE = 61;
  int PRIVATE = 62;
  int PROTECTED = 63;
  int PUBLIC = 64;
  int RETURN = 65;
  int SHORT = 66;
  int STATIC = 67;
  int STRICTFP = 68;
  int SUPER = 69;
  int SWITCH = 70;
  int SYNCHRONIZED = 71;
  int THIS = 72;
  int THROW = 73;
  int THROWS = 74;
  int TRANSIENT = 75;
  int TRUE = 76;
  int TRY = 77;
  int VOID = 78;
  int VOLATILE = 79;
  int WHILE = 80;
  int INTEGER_LITERAL = 81;
  int DECIMAL_LITERAL = 82;
  int HEX_LITERAL = 83;
  int OCTAL_LITERAL = 84;
  int FLOATING_POINT_LITERAL = 85;
  int DECIMAL_FLOATING_POINT_LITERAL = 86;
  int DECIMAL_EXPONENT = 87;
  int HEXADECIMAL_FLOATING_POINT_LITERAL = 88;
  int HEXADECIMAL_EXPONENT = 89;
  int CHARACTER_LITERAL = 90;
  int STRING_LITERAL = 91;
  int LPAREN = 92;
  int RPAREN = 93;
  int LBRACE = 94;
  int RBRACE = 95;
  int LBRACKET = 96;
  int RBRACKET = 97;
  int SEMICOLON = 98;
  int COMMA = 99;
  int DOT = 100;
  int ASSIGN = 101;
  int LT = 102;
  int BANG = 103;
  int TILDE = 104;
  int HOOK = 105;
  int COLON = 106;
  int EQ = 107;
  int LE = 108;
  int GE = 109;
  int NE = 110;
  int SC_OR = 111;
  int SC_AND = 112;
  int INCR = 113;
  int DECR = 114;
  int PLUS = 115;
  int MINUS = 116;
  int STAR = 117;
  int SLASH = 118;
  int BIT_AND = 119;
  int BIT_OR = 120;
  int XOR = 121;
  int REM = 122;
  int PLUSASSIGN = 123;
  int MINUSASSIGN = 124;
  int STARASSIGN = 125;
  int SLASHASSIGN = 126;
  int ANDASSIGN = 127;
  int ORASSIGN = 128;
  int XORASSIGN = 129;
  int REMASSIGN = 130;
  int RUNSIGNEDSHIFT = 131;
  int RSIGNEDSHIFT = 132;
  int GT = 133;
  int LANGLE = 102;
  int RANGLE = 133;
  int IDENTIFIER = 141;
  int LETTER = 142;
  int PART_LETTER = 143;

  int DEFAULT = 0;
  int AFTER_EGEN = 1;
  int IN_SINGLE_LINE_COMMENT = 2;
  int IN_FORMAL_COMMENT = 3;
  int IN_MULTI_LINE_COMMENT = 4;

  String[] tokenImage = {
    "<EOF>",
    "\"options\"",
    "\"LOOKAHEAD\"",
    "\"IGNORE_CASE\"",
    "\"PARSER_BEGIN\"",
    "\"PARSER_END\"",
    "\"JAVACODE\"",
    "\"TOKEN\"",
    "\"SPECIAL_TOKEN\"",
    "\"MORE\"",
    "\"SKIP\"",
    "\"TOKEN_MGR_DECLS\"",
    "\"EOF\"",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "\"/*@egen*/\"",
    "<token of kind 19>",
    "\"//\"",
    "<token of kind 21>",
    "\"/*\"",
    "\"/*@bgen(jjtree\"",
    "<SINGLE_LINE_COMMENT>",
    "\"*/\"",
    "\"*/\"",
    "<token of kind 27>",
    "\"abstract\"",
    "\"assert\"",
    "\"boolean\"",
    "\"break\"",
    "\"byte\"",
    "\"case\"",
    "\"catch\"",
    "\"char\"",
    "\"class\"",
    "\"const\"",
    "\"continue\"",
    "\"default\"",
    "\"do\"",
    "\"double\"",
    "\"else\"",
    "\"enum\"",
    "\"extends\"",
    "\"false\"",
    "\"final\"",
    "\"finally\"",
    "\"float\"",
    "\"for\"",
    "\"goto\"",
    "\"if\"",
    "\"implements\"",
    "\"import\"",
    "\"instanceof\"",
    "\"int\"",
    "\"interface\"",
    "\"long\"",
    "\"native\"",
    "\"new\"",
    "\"null\"",
    "\"package\"",
    "\"private\"",
    "\"protected\"",
    "\"public\"",
    "\"return\"",
    "\"short\"",
    "\"static\"",
    "\"strictfp\"",
    "\"super\"",
    "\"switch\"",
    "\"synchronized\"",
    "\"this\"",
    "\"throw\"",
    "\"throws\"",
    "\"transient\"",
    "\"true\"",
    "\"try\"",
    "\"void\"",
    "\"volatile\"",
    "\"while\"",
    "<INTEGER_LITERAL>",
    "<DECIMAL_LITERAL>",
    "<HEX_LITERAL>",
    "<OCTAL_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<DECIMAL_FLOATING_POINT_LITERAL>",
    "<DECIMAL_EXPONENT>",
    "<HEXADECIMAL_FLOATING_POINT_LITERAL>",
    "<HEXADECIMAL_EXPONENT>",
    "<CHARACTER_LITERAL>",
    "<STRING_LITERAL>",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\";\"",
    "\",\"",
    "\".\"",
    "\"=\"",
    "\"<\"",
    "\"!\"",
    "\"~\"",
    "\"?\"",
    "\":\"",
    "\"==\"",
    "\"<=\"",
    "\">=\"",
    "\"!=\"",
    "\"||\"",
    "\"&&\"",
    "\"++\"",
    "\"--\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"&\"",
    "\"|\"",
    "\"^\"",
    "\"%\"",
    "\"+=\"",
    "\"-=\"",
    "\"*=\"",
    "\"/=\"",
    "\"&=\"",
    "\"|=\"",
    "\"^=\"",
    "\"%=\"",
    "\">>>\"",
    "\">>\"",
    "\">\"",
    "\"#\"",
    "\"...\"",
    "\"<<=\"",
    "\">>=\"",
    "\">>>=\"",
    "\"<<\"",
    "\"@\"",
    "<IDENTIFIER>",
    "<LETTER>",
    "<PART_LETTER>",
  };

}
