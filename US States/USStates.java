import javax.swing.*;

/**
 * This project implements the map of the United States based on the 50 states.
 * Once you move your cursor into one of the states, you should be able to see the name 
 * of the state in the bottom-right corner.
 * The work and code from this project extends from the starting code provided by the 
 * professor, as well as implementing concepts that we have learned throughout the course.
 * In all the classes where changes were made, there will be explanation to why and how
 * those changes effect the outcome of the project.
 */
public class USStates
{
    public static void main(String[] args)
    {
    	new USStates();
    }
    
    public USStates()
    {        
        //Defining the geometric objects that represent the problem data
        Rectangle[] r = new Rectangle[111];
        
        // Below are rectangles that will represent the area of all the different
        // states in the map. For a better fit, some states will have multiple 
        // rectangles, so that there is as much coverage for the state as possible.
        
        // Florida
        Rectangle r1 = new Rectangle(new Point(515, 322), new Point(618, 343));
        r1.setRectangleName("Florida");
        r[0] = r1;
        Rectangle r111 = new Rectangle(new Point(588, 335), new Point(646, 404));
        r111.setRectangleName("Florida");
        r[110] = r111;
        
        // New Mexico
        Rectangle r2 = new Rectangle(new Point(203, 230), new Point(278, 306));
        r2.setRectangleName("New Mexico");
        r[1] = r2;
        
        // Arizona
        Rectangle r3 = new Rectangle(new Point(123, 230), new Point(190, 304));
        r3.setRectangleName("Arizona");
        r[2] = r3;
        
        // Texas
        Rectangle r4 = new Rectangle(new Point(287, 241), new Point(321, 356));
        r4.setRectangleName("Texas");
        r[3] = r4;
        Rectangle r5 = new Rectangle(new Point(312, 288), new Point(409, 412));
        r5.setRectangleName("Texas");
        r[4] = r5;
        Rectangle r6 = new Rectangle(new Point(235, 311), new Point(290, 350));
        r6.setRectangleName("Texas");
        r[5] = r6;
        
        // Hawaii
        Rectangle r7 = new Rectangle(new Point(199, 358), new Point(278, 416));
        r7.setRectangleName("Hawaii");
        r[6] = r7;
        
        // Alaska
        Rectangle r8 = new Rectangle(new Point(32, 311), new Point(138, 415));
        r8.setRectangleName("Alaska");
        r[7] = r8;
        
        // California
        Rectangle r9 = new Rectangle(new Point(15, 117), new Point(60, 190));
        r9.setRectangleName("California");
        r[8] = r9;
        Rectangle r10 = new Rectangle(new Point(14, 184), new Point(71, 255));
        r10.setRectangleName("California");
        r[9] = r10;
        Rectangle r11 = new Rectangle(new Point(70, 230), new Point(106, 275));
        r11.setRectangleName("California");
        r[10] = r11;
        
        
        // New York
        Rectangle r12 = new Rectangle(new Point(627, 76), new Point(662, 124));
        r12.setRectangleName("New York");
        r[11] = r12;
        Rectangle r13 = new Rectangle(new Point(590, 110), new Point(639, 126));
        r13.setRectangleName("New York");
        r[12] = r13;
        Rectangle r77 = new Rectangle(new Point(657, 104), new Point(671, 130));
        r77.setRectangleName("New York");
        r[76] = r77;
        Rectangle r93 = new Rectangle(new Point(673, 135), new Point(691, 143));
        r93.setRectangleName("New York");
        r[92] = r93;
        
        // Nevada
        Rectangle r14 = new Rectangle(new Point(73, 135), new Point(139, 171));
        r14.setRectangleName("Nevada");
        r[13] = r14;
        Rectangle r15 = new Rectangle(new Point(101, 172), new Point(131, 215));
        r15.setRectangleName("Nevada");
        r[14] = r15;
        Rectangle r16 = new Rectangle(new Point(85, 169), new Point(107, 192));
        r16.setRectangleName("Nevada");
        r[15] = r16;
        
        // Utah
        Rectangle r17 = new Rectangle(new Point(151, 142), new Point(182, 211));
        r17.setRectangleName("Utah");
        r[16] = r17;
        Rectangle r18 = new Rectangle(new Point(146, 164), new Point(201, 214));
        r18.setRectangleName("Utah");
        r[17] = r18;
        
        // Colorado
        Rectangle r19 = new Rectangle(new Point(214, 168), new Point(297, 222));
        r19.setRectangleName("Colorado");
        r[18] = r19;
        
        // Kansas
        Rectangle r20 = new Rectangle(new Point(305, 187), new Point(400, 229));
        r20.setRectangleName("Kansas");
        r[19] = r20;
        
        // Oklahoma
        Rectangle r21 = new Rectangle(new Point(330, 233), new Point(405, 275));
        r21.setRectangleName("Oklahoma");
        r[20] = r21;
        Rectangle r22 = new Rectangle(new Point(288, 232), new Point(332, 240));
        r22.setRectangleName("Oklahoma");
        r[21] = r22;
        
        // Oregon
        Rectangle r23 = new Rectangle(new Point(19, 63), new Point(115, 109));
        r23.setRectangleName("Oregon");
        r[22] = r23;
        Rectangle r24 = new Rectangle(new Point(75, 97), new Point(111, 121));
        r24.setRectangleName("Oregon");
        r[23] = r24;
        
        // Washington
        Rectangle r25 = new Rectangle(new Point(37, 5), new Point(128, 44));
        r25.setRectangleName("Washington");
        r[24] = r25;
        Rectangle r26 = new Rectangle(new Point(59, 40), new Point(124, 60));
        r26.setRectangleName("Washington");
        r[25] = r26;
        
        // Idaho
        Rectangle r27 = new Rectangle(new Point(137, 20), new Point(144, 61));
        r27.setRectangleName("Idaho");
        r[26] = r27;
        Rectangle r28 = new Rectangle(new Point(130, 60), new Point(151, 126));
        r28.setRectangleName("Idaho");
        r[27] = r28;
        Rectangle r29 = new Rectangle(new Point(120, 100), new Point(187, 132));
        r29.setRectangleName("Idaho");
        r[28] = r29;
        Rectangle r30 = new Rectangle(new Point(124, 83), new Point(163, 126));
        r30.setRectangleName("Idaho");
        r[29] = r30;
        
        // Montana
        Rectangle r31 = new Rectangle(new Point(152, 25), new Point(284, 53));
        r31.setRectangleName("Montana");
        r[30] = r31;
        Rectangle r32 = new Rectangle(new Point(166, 53), new Point(281, 95));
        r32.setRectangleName("Montana");
        r[31] = r32;
        
        // Wyoming
        Rectangle r33 = new Rectangle(new Point(196, 101), new Point(276, 158));
        r33.setRectangleName("Wyoming");
        r[32] = r33;
        
        // North Dakota
        Rectangle r34 = new Rectangle(new Point(290, 41), new Point(366, 86));
        r34.setRectangleName("North Dakota");
        r[33] = r34;
        
        // South Dakota
        Rectangle r35 = new Rectangle(new Point(286, 89), new Point(374, 133));
        r35.setRectangleName("South Dakota");
        r[34] = r35;
        
        // Nebraska
        Rectangle r36 = new Rectangle(new Point(282, 140), new Point(375, 164));
        r36.setRectangleName("Nebraska");
        r[35] = r36;
        Rectangle r37 = new Rectangle(new Point(305, 160), new Point(382, 182));
        r37.setRectangleName("Nebraska");
        r[36] = r37;
        
        // Minnesota
        Rectangle r38 = new Rectangle(new Point(378, 44), new Point(421, 125));
        r38.setRectangleName("Minnesota");
        r[37] = r38;
        Rectangle r39 = new Rectangle(new Point(411, 44), new Point(450, 71));
        r39.setRectangleName("Minnesota");
        r[38] = r39;
        
        // Iowa
        Rectangle r40 = new Rectangle(new Point(385, 131), new Point(444, 170));
        r40.setRectangleName("Iowa");
        r[39] = r40;
        
        // Missouri
        Rectangle r41 = new Rectangle(new Point(402, 176), new Point(442, 237));
        r41.setRectangleName("Missouri");
        r[40] = r41;
        Rectangle r42 = new Rectangle(new Point(439, 202), new Point(459, 235));
        r42.setRectangleName("Missouri");
        r[41] = r42;
        Rectangle r43 = new Rectangle(new Point(449, 217), new Point(474, 235));
        r43.setRectangleName("Missouri");
        r[42] = r43;
        
        // Arkansas
        Rectangle r44 = new Rectangle(new Point(407, 244), new Point(451, 283));
        r44.setRectangleName("Arkansas");
        r[43] = r44;
        Rectangle r45 = new Rectangle(new Point(415, 281), new Point(453, 291));
        r45.setRectangleName("Arkansas");
        r[44] = r45;
        Rectangle r46 = new Rectangle(new Point(446, 242), new Point(467, 256));
        r46.setRectangleName("Arkansas");
        r[45] = r46;
        
        // Louisiana
        Rectangle r47 = new Rectangle(new Point(418, 297), new Point(453, 348));
        r47.setRectangleName("Louisiana");
        r[46] = r47;
        Rectangle r48 = new Rectangle(new Point(444, 328), new Point(480, 354));
        r48.setRectangleName("Louisiana");
        r[47] = r48;
        
        // Mississippi
        Rectangle r49 = new Rectangle(new Point(467, 264), new Point(495, 317));
        r49.setRectangleName("Mississippi");
        r[48] = r49;
        Rectangle r50 = new Rectangle(new Point(459, 275), new Point(485, 323));
        r50.setRectangleName("Mississippi");
        r[49] = r50;
        Rectangle r51 = new Rectangle(new Point(480, 315), new Point(498, 336));
        r51.setRectangleName("Mississippi");
        r[50] = r51;
        
        // Alabama
        Rectangle r52 = new Rectangle(new Point(499, 260), new Point(534, 318));
        r52.setRectangleName("Alabama");
        r[51] = r52;
        Rectangle r53 = new Rectangle(new Point(500, 315), new Point(512, 331));
        r53.setRectangleName("Alabama");
        r[52] = r53;
        Rectangle r54 = new Rectangle(new Point(527, 298), new Point(547, 316));
        r54.setRectangleName("Alabama");
        r[53] = r54;
        
        // Georgia
        Rectangle r55 = new Rectangle(new Point(550, 256), new Point(566, 320));
        r55.setRectangleName("Georgia");
        r[54] = r55;
        Rectangle r56 = new Rectangle(new Point(562, 273), new Point(589, 318));
        r56.setRectangleName("Georgia");
        r[55] = r56;
        Rectangle r57 = new Rectangle(new Point(583, 295), new Point(611, 315));
        r57.setRectangleName("Georgia");
        r[56] = r57;
        Rectangle r58 = new Rectangle(new Point(539, 256), new Point(565, 276));
        r58.setRectangleName("Georgia");
        r[57] = r58;
        
        // Tennessee
        Rectangle r59 = new Rectangle(new Point(475, 238), new Point(548, 254));
        r59.setRectangleName("Tennessee");
        r[58] = r59;
        Rectangle r60 = new Rectangle(new Point(496, 233), new Point(565, 240));
        r60.setRectangleName("Tennessee");
        r[59] = r60;
        Rectangle r61 = new Rectangle(new Point(470, 252), new Point(495, 258));
        r61.setRectangleName("Tennessee");
        r[60] = r61;
        
        // Kentucky
        Rectangle r62 = new Rectangle(new Point(495, 215), new Point(555, 226));
        r62.setRectangleName("Kentucky");
        r[61] = r62;
        Rectangle r63 = new Rectangle(new Point(527, 198), new Point(566, 220));
        r63.setRectangleName("Kentucky");
        r[62] = r63;
        Rectangle r64 = new Rectangle(new Point(482, 225), new Point(494, 233));
        r64.setRectangleName("Kentucky");
        r[63] = r64;
        
        // Illinois
        Rectangle r65 = new Rectangle(new Point(461, 142), new Point(491, 213));
        r65.setRectangleName("Illinois");
        r[64] = r65;
        Rectangle r66 = new Rectangle(new Point(449, 161), new Point(495, 188));
        r66.setRectangleName("Illinois");
        r[65] = r66;
        
        // Wisconsin
        Rectangle r67 = new Rectangle(new Point(428, 77), new Point(448, 107));
        r67.setRectangleName("Wisconsin");
        r[66] = r67;
        Rectangle r68 = new Rectangle(new Point(447, 87), new Point(479, 139));
        r68.setRectangleName("Wisconsin");
        r[67] = r68;
        Rectangle r69 = new Rectangle(new Point(463, 100), new Point(494, 137));
        r69.setRectangleName("Wisconsin");
        r[68] = r69;
        
        // Michigan
        Rectangle r70 = new Rectangle(new Point(452, 62), new Point(533, 82));
        r70.setRectangleName("Michigan");
        r[69] = r70;
        Rectangle r71 = new Rectangle(new Point(484, 78), new Point(542, 97));
        r71.setRectangleName("Michigan");
        r[70] = r71;
        Rectangle r72 = new Rectangle(new Point(501, 82), new Point(558, 146));
        r72.setRectangleName("Michigan");
        r[71] = r72;
        
        // Indiana
        Rectangle r73 = new Rectangle(new Point(497, 149), new Point(529, 194));
        r73.setRectangleName("Indiana");
        r[72] = r73;
        Rectangle r74 = new Rectangle(new Point(499, 190), new Point(520, 207));
        r74.setRectangleName("Indiana");
        r[73] = r74;
        
        // Ohio
        Rectangle r75 = new Rectangle(new Point(535, 150), new Point(584, 176));
        r75.setRectangleName("Ohio");
        r[74] = r75;
        Rectangle r76 = new Rectangle(new Point(536, 171), new Point(568, 191));
        r76.setRectangleName("Ohio");
        r[75] = r76;
        
        // Pennsylvania
        Rectangle r78 = new Rectangle(new Point(589, 135), new Point(655, 155));
        r78.setRectangleName("Pennsylvania");
        r[77] = r78;
        Rectangle r79 = new Rectangle(new Point(590, 145), new Point(651, 160));
        r79.setRectangleName("Pennsylvania");
        r[78] = r79;
        
        // West Virginia
        Rectangle r80 = new Rectangle(new Point(572, 188), new Point(599, 207));
        r80.setRectangleName("West Virginia");
        r[79] = r80;
        Rectangle r81 = new Rectangle(new Point(579, 180), new Point(610, 188));
        r81.setRectangleName("West Virginia");
        r[80] = r81;
        Rectangle r82 = new Rectangle(new Point(587, 172), new Point(616, 179));
        r82.setRectangleName("West Virginia");
        r[81] = r82;
        
        // Virginia
        Rectangle r83 = new Rectangle(new Point(571, 212), new Point(587, 224));
        r83.setRectangleName("Virginia");
        r[82] = r83;
        Rectangle r84 = new Rectangle(new Point(571, 212), new Point(607, 219));
        r84.setRectangleName("Virginia");
        r[83] = r84;
        Rectangle r85 = new Rectangle(new Point(603, 191), new Point(635, 214));
        r85.setRectangleName("Virginia");
        r[84] = r85;
        Rectangle r86 = new Rectangle(new Point(619, 174), new Point(635, 215));
        r86.setRectangleName("Virginia");
        r[85] = r86;
        Rectangle r87 = new Rectangle(new Point(632, 188), new Point(659, 210));
        r87.setRectangleName("Virginia");
        r[86] = r87;
        
        // Maryland
        Rectangle r88 = new Rectangle(new Point(628, 166), new Point(653, 175));
        r88.setRectangleName("Maryland");
        r[87] = r88;
        Rectangle r89 = new Rectangle(new Point(640, 164), new Point(655, 186));
        r89.setRectangleName("Maryland");
        r[88] = r89;
        Rectangle r90 = new Rectangle(new Point(651, 180), new Point(667, 187));
        r90.setRectangleName("Maryland");
        r[89] = r90;
        
        // Delaware
        Rectangle r91 = new Rectangle(new Point(656, 167), new Point(667, 178));
        r91.setRectangleName("Delaware");
        r[90] = r91;
        
        // New Jersey
        Rectangle r92 = new Rectangle(new Point(659, 134), new Point(672, 166));
        r92.setRectangleName("New Jersey");
        r[91] = r92;
        
        // Connecticut
        Rectangle r94 = new Rectangle(new Point(676, 119), new Point(694, 128));
        r94.setRectangleName("Connecticut");
        r[93] = r94;
        
        // Rhode Island
        Rectangle r95 = new Rectangle(new Point(695, 115), new Point(702, 124));
        r95.setRectangleName("Rhode Island");
        r[94] = r95;
        
        // Massachusetts
        Rectangle r96 = new Rectangle(new Point(674, 108), new Point(705, 112));
        r96.setRectangleName("Massachusetts");
        r[95] = r96;
        Rectangle r97 = new Rectangle(new Point(701, 100), new Point(723, 118));
        r97.setRectangleName("Massachusetts");
        r[96] = r97;
        
        // Vermont
        Rectangle r98 = new Rectangle(new Point(667, 68), new Point(679, 90));
        r98.setRectangleName("Vermont");
        r[97] = r98;
        Rectangle r99 = new Rectangle(new Point(672, 88), new Point(679, 104));
        r99.setRectangleName("Vermont");
        r[98] = r99;
        
        // New Hampshire
        Rectangle r100 = new Rectangle(new Point(682, 79), new Point(696, 104));
        r100.setRectangleName("New Hampshire");
        r[99] = r100;
        Rectangle r101 = new Rectangle(new Point(684, 62), new Point(690, 78));
        r101.setRectangleName("New Hampshire");
        r[100] = r101;
        
        // Maine
        Rectangle r102 = new Rectangle(new Point(690, 16), new Point(743, 60));
        r102.setRectangleName("Maine");
        r[101] = r102;
        Rectangle r103 = new Rectangle(new Point(699, 55), new Point(737, 92));
        r103.setRectangleName("Maine");
        r[102] = r103;
        
        // North Carolina
        Rectangle r104 = new Rectangle(new Point(556, 244), new Point(567, 250));
        r104.setRectangleName("North Carolina");
        r[103] = r104;
        Rectangle r105 = new Rectangle(new Point(569, 237), new Point(589, 244));
        r105.setRectangleName("North Carolina");
        r[104] = r105;
        Rectangle r106 = new Rectangle(new Point(584, 224), new Point(643, 248));
        r106.setRectangleName("North Carolina");
        r[105] = r106;
        Rectangle r107 = new Rectangle(new Point(631, 218), new Point(670, 258));
        r107.setRectangleName("North Carolina");
        r[106] = r107;
        
        // South Carolina
        Rectangle r108 = new Rectangle(new Point(575, 247), new Point(615, 267));
        r108.setRectangleName("South Carolina");
        r[107] = r108;
        Rectangle r109 = new Rectangle(new Point(600, 251), new Point(621, 285));
        r109.setRectangleName("South Carolina");
        r[108] = r109;
        Rectangle r110 = new Rectangle(new Point(607, 260), new Point(636, 292));
        r110.setRectangleName("South Carolina");
        r[109] = r110;
        
        // Call the FrameDisplay constructor with the rectangle array.
        FrameDisplay frame = new FrameDisplay(r);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
