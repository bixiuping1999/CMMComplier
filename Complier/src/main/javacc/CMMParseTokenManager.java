/* Generated By:JavaCC: Do not edit this line. CMMParseTokenManager.java */
package main.javacc;
                    //the package for saving code
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/** Token Manager. */
public class CMMParseTokenManager implements CMMParseConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x2000000000L) != 0L)
            return 1;
         if ((active0 & 0x3fff80L) != 0L)
         {
            jjmatchedKind = 24;
            return 3;
         }
         if ((active0 & 0x4000000000000L) != 0L)
            return 23;
         return -1;
      case 1:
         if ((active0 & 0x80L) != 0L)
            return 3;
         if ((active0 & 0x3fff00L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 1;
            return 3;
         }
         return -1;
      case 2:
         if ((active0 & 0x11000L) != 0L)
            return 3;
         if ((active0 & 0x3eef00L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 2;
            return 3;
         }
         return -1;
      case 3:
         if ((active0 & 0x162500L) != 0L)
            return 3;
         if ((active0 & 0x28ca00L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 3;
            return 3;
         }
         return -1;
      case 4:
         if ((active0 & 0x88000L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 4;
            return 3;
         }
         if ((active0 & 0x204a00L) != 0L)
            return 3;
         return -1;
      case 5:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 5;
            return 3;
         }
         if ((active0 & 0x80000L) != 0L)
            return 3;
         return -1;
      case 6:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 6;
            return 3;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 38:
         jjmatchedKind = 51;
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 40:
         return jjStopAtPos(0, 29);
      case 41:
         return jjStopAtPos(0, 30);
      case 42:
         return jjStopAtPos(0, 49);
      case 43:
         return jjStopAtPos(0, 47);
      case 44:
         return jjStopAtPos(0, 36);
      case 45:
         return jjStopAtPos(0, 48);
      case 46:
         return jjStartNfaWithStates_0(0, 37, 1);
      case 47:
         return jjStartNfaWithStates_0(0, 50, 23);
      case 59:
         return jjStopAtPos(0, 35);
      case 60:
         jjmatchedKind = 40;
         return jjMoveStringLiteralDfa1_0(0x140000000000L);
      case 61:
         jjmatchedKind = 38;
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 62:
         jjmatchedKind = 39;
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 91:
         return jjStopAtPos(0, 33);
      case 93:
         return jjStopAtPos(0, 34);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x44000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x28000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x210000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x1080L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x80400L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 123:
         return jjStopAtPos(0, 31);
      case 124:
         jjmatchedKind = 52;
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 125:
         return jjStopAtPos(0, 32);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStopAtPos(1, 46);
         break;
      case 61:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         else if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(1, 42);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStopAtPos(1, 43);
         break;
      case 62:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(1, 44);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 102:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(1, 7, 3);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x20200L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x58000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x104800L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      case 124:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStopAtPos(1, 45);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x22400L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0xa00L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 114:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(2, 16, 3);
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 116:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(2, 12, 3);
         break;
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 101:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 3);
         else if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(3, 20, 3);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 108:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(3, 13, 3);
         else if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(3, 18, 3);
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 110:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(3, 10, 3);
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 114:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 3);
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(4, 9, 3);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(4, 21, 3);
         break;
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 107:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 14, 3);
         break;
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000L);
      case 116:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 3);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 103:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(5, 19, 3);
         break;
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(7, 15, 3);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 42;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 22)
                        kind = 22;
                     jjCheckNAddStates(0, 5);
                  }
                  else if (curChar == 47)
                     jjAddStates(6, 7);
                  else if (curChar == 39)
                     jjAddStates(8, 9);
                  else if (curChar == 34)
                     jjCheckNAddStates(10, 12);
                  else if (curChar == 46)
                     jjCheckNAdd(1);
                  break;
               case 23:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(29, 30);
                  else if (curChar == 47)
                     jjCheckNAddStates(13, 15);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAdd(1);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 4:
                  if (curChar == 34)
                     jjCheckNAddStates(10, 12);
                  break;
               case 5:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 7:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 8:
                  if (curChar == 34 && kind > 27)
                     kind = 27;
                  break;
               case 9:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(16, 19);
                  break;
               case 10:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 11:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 12:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(10);
                  break;
               case 13:
                  if (curChar == 39)
                     jjAddStates(8, 9);
                  break;
               case 14:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAdd(15);
                  break;
               case 15:
                  if (curChar == 39 && kind > 28)
                     kind = 28;
                  break;
               case 17:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAdd(15);
                  break;
               case 18:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(19, 15);
                  break;
               case 19:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(15);
                  break;
               case 20:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 21:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(19);
                  break;
               case 22:
                  if (curChar == 47)
                     jjAddStates(6, 7);
                  break;
               case 24:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(13, 15);
                  break;
               case 25:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 26:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 27:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(29, 30);
                  break;
               case 29:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(29, 30);
                  break;
               case 30:
                  if (curChar == 42)
                     jjCheckNAddStates(20, 22);
                  break;
               case 31:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(32, 30);
                  break;
               case 32:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(32, 30);
                  break;
               case 33:
                  if (curChar == 47 && kind > 6)
                     kind = 6;
                  break;
               case 34:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddStates(0, 5);
                  break;
               case 35:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAdd(35);
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAdd(36);
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(37, 38);
                  break;
               case 38:
                  if (curChar == 46 && kind > 23)
                     kind = 23;
                  break;
               case 39:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(39, 40);
                  break;
               case 40:
                  if (curChar == 46)
                     jjCheckNAdd(41);
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAdd(41);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAdd(3);
                  break;
               case 3:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAdd(3);
                  break;
               case 5:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 6:
                  if (curChar == 92)
                     jjAddStates(23, 25);
                  break;
               case 7:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 14:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAdd(15);
                  break;
               case 16:
                  if (curChar == 92)
                     jjAddStates(26, 28);
                  break;
               case 17:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAdd(15);
                  break;
               case 24:
                  jjAddStates(13, 15);
                  break;
               case 29:
                  jjCheckNAddTwoStates(29, 30);
                  break;
               case 31:
               case 32:
                  jjCheckNAddTwoStates(32, 30);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(10, 12);
                  break;
               case 14:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 24:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(13, 15);
                  break;
               case 29:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(29, 30);
                  break;
               case 31:
               case 32:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(32, 30);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 42 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   35, 36, 37, 38, 39, 40, 23, 28, 14, 16, 5, 6, 8, 24, 25, 27, 
   5, 6, 10, 8, 30, 31, 33, 7, 9, 11, 17, 18, 20, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\151\146", "\145\154\163\145", 
"\167\150\151\154\145", "\163\143\141\156", "\160\162\151\156\164", "\151\156\164", 
"\162\145\141\154", "\142\162\145\141\153", "\143\157\156\164\151\156\165\145", "\146\157\162", 
"\143\150\141\162", "\142\157\157\154", "\163\164\162\151\156\147", "\164\162\165\145", 
"\146\141\154\163\145", null, null, null, null, null, null, null, "\50", "\51", "\173", "\175", 
"\133", "\135", "\73", "\54", "\56", "\75", "\76", "\74", "\75\75", "\74\75", 
"\76\75", "\74\76", "\174\174", "\46\46", "\53", "\55", "\52", "\57", "\46", "\174", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1ffffff9ffff81L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[42];
static private final int[] jjstateSet = new int[84];
static protected char curChar;
/** Constructor. */
public CMMParseTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public CMMParseTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 42; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}