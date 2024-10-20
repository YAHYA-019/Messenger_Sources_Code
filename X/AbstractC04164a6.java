package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.rtc.callstatus.notification.MissedCallNotification;
import com.facebook.orca.notify.LoggedOutNotification;
import com.facebook.user.model.UserKey;
import java.util.concurrent.ExecutionException;

/* renamed from: X.4a6, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4a6.class */
public abstract class AbstractC04164a6 implements InterfaceC04174a7 {
    public final C00i A00 = new 1BV(67099);

    public static Context A0E(4a5 r301) {
        return (Context) r301.A0G.get();
    }

    public static C10914uy A0F(MessagingNotification messagingNotification, 4a5 r302, int i) {
        return ((C10904ux) r302.A0T.get()).A00((Context) r302.A0G.get(), null, messagingNotification, i);
    }

    public static 5pC A0G(4a5 r301) {
        return (5pC) r301.A0m.get();
    }

    public static void A0H(C10924uz c10924uz, 4a5 r302, int i) {
        ((4aO) r302.A0j.get()).A02(i, c10924uz.A07());
    }

    public static void A0I(MessagingNotification messagingNotification, 4a5 r302) {
        ((C5dx) r302.A0b.get()).A01(messagingNotification);
    }

    private void A0K(MissedCallNotification missedCallNotification) {
        int i;
        4a5 r0 = (4a5) this;
        if (missedCallNotification.A03.A05) {
            return;
        }
        ThreadKey threadKey = missedCallNotification.A02;
        threadKey.getClass();
        try {
            i = ((Number) ((DIG) r0.A0D.get()).BI6(threadKey).get()).intValue();
        } catch (InterruptedException | ExecutionException e) {
            i = 0;
            4zI.A01("DefaultMessagingNotificationHandler", "Error loading unseen missed calls for thread", new Object[]{e});
        }
        if (((5pC) r0.A0m.get()).A01(1Fw.A04((1EZ) 1Bn.A0A(16428)), threadKey, missedCallNotification, 10010)) {
            return;
        }
        long parseLong = Long.parseLong(missedCallNotification.A07);
        3pI r02 = new 3pI();
        r02.A09 = new UserKey(1Js.A03, String.valueOf(parseLong));
        r02.A0D = null;
        ((5bF) r0.A0a.get()).A0A(r02.A00(), threadKey, new Cnr(missedCallNotification, r0, i, parseLong));
    }

    private void A0L(LoggedOutNotification loggedOutNotification) {
        4a5.A05(1Fw.A04((1EZ) 1Bn.A0A(16428)), loggedOutNotification, (4a5) this, loggedOutNotification.A03, loggedOutNotification.A01, loggedOutNotification.A02);
        loggedOutNotification.A00 = true;
    }

    public abstract void A0J(MessagingNotification messagingNotification);

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008e, code lost:
    
        if (X.5bG.A00((X.5bG) r301.A00.get()).AZk(72341250858160640L) == false) goto L15;
     */
    @Override // X.InterfaceC04174a7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ABc(com.facebook.messaging.notify.type.MessagingNotification r302) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC04164a6.ABc(com.facebook.messaging.notify.type.MessagingNotification):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:247|(13:248|249|250|251|252|253|254|255|256|257|258|259|260)|(7:262|263|264|265|266|267|268)(47:1240|1241|1242|(1:1309)(1:1263)|1264|1265|1266|1267|1268|1269|1270|1271|1272|(14:1283|1284|1285|1286|1287|1288|1289|1290|1291|1292|1293|1294|1295|(6:1297|1298|1299|1300|1301|1302)(2:1303|1304))|271|272|273|274|275|276|277|278|279|280|281|282|283|284|285|286|287|288|289|290|(22:292|293|294|295|296|297|298|299|300|301|302|303|304|305|306|307|308|309|310|311|312|313)(19:326|327|328|329|330|331|332|333|334|335|336|337|338|339|(1:341)|342|343|344|(7:373|374|(48:434|435|436|437|438|(10:440|441|442|443|444|445|446|447|448|449)(12:490|491|492|(2:1234|1235)|507|508|509|510|511|(3:513|514|(19:1228|536|537|538|1e3d|545|(2:547|(6:564|565|566|567|568|(21:580|581|582|583|584|585|586|587|588|589|590|591|592|(1:594)|595|596|597|598|599|600|(21:602|(19:604|605|606|607|608|609|610|611|612|613|614|615|616|617|618|619|620|621|622)|623|624|625|626|627|628|(3:695|696|(5:698|699|700|701|(3:703|704|(9:706|707|708|709|710|711|712|713|(77:715|716|717|718|719|720|721|722|723|724|725|726|727|728|729|730|731|732|733|734|735|736|737|738|739|740|741|742|743|744|745|746|747|748|749|(9:811|812|813|814|815|816|817|818|(6:820|821|822|823|824|(5:826|827|828|829|830)))(6:751|752|753|754|755|(45:805|806|807|808|809|810|766|767|768|769|770|771|772|773|774|775|776|777|778|779|780|781|782|783|784|785|786|787|788|789|790|791|792|793|794|795|796|797|798|799|800|801|802|803|804))|764|765|766|767|768|769|770|771|772|773|774|775|776|777|778|779|780|781|782|783|784|785|786|787|788|789|790|791|792|793|794|795|796|797|798|799|800|801|802|803|804))))(8:831|832|(8:834|835|836|837|838|839|840|(8:846|847|848|849|850|851|852|(11:854|855|856|857|858|859|860|861|862|863|(4:865|866|867|(33:869|870|871|872|873|874|875|876|877|878|879|880|881|(3:883|884|(1:886))|887|888|889|890|891|892|893|894|895|896|897|898|899|900|901|902|903|904|905)))(24:906|907|908|909|910|911|912|913|914|915|916|917|918|919|920|(5:922|923|924|925|926)|927|928|929|930|931|932|933|(28:935|936|937|938|939|940|941|942|943|944|945|946|947|948|949|950|951|952|953|954|955|956|957|958|959|960|961|962)(75:963|964|965|966|967|968|969|970|971|972|973|974|975|976|977|978|979|980|(4:982|983|984|985)|986|987|988|(6:1127|1128|1129|1130|1131|1132)|997|998|999|1000|1001|1002|1003|1004|1005|1006|1007|1008|1009|1010|(25:1012|1013|1014|1015|1016|1017|1018|1019|1020|1021|1022|1023|1024|1025|1026|1027|1028|1029|1030|1031|1032|1033|1034|1035|1036)|1037|1038|1039|(27:1041|1042|1043|1044|1045|1046|1047|1048|1049|1050|1051|1052|1053|1054|1055|1056|1057|1058|1059|1060|1061|1062|1063|1064|1065|1066|1067)|1068|1069|1070|1071|1072|1073|1074|1075|1076|1077|1078|1079|1080|1081|1082|1083|1084|1085|1086|1087|1088|1089|1090|1091|1092|1093|1094|1095|1096|1097|1098|1099|1100))))|1133|1134|1135|1136|(85:1138|1139|1140|1141|1142|1143|1144|1145|1146|1147|1148|1149|1150|1151|1152|1153|1154|1155|1156|1157|1158|1159|1160|1161|1162|1163|1164|1165|1166|1167|1168|1169|1170|1171|1172|1173|1174|1175|1176|1177|1178|1179|1180|1181|1182|1183|1184|1185|1186|1187|1188|1189|1190|1191|1192|1193|1194|1195|1196|1197|1198|1199|1200|1201|1202|1203|1204|1205|1206|1207|1208|1209|1210|1211|1212|1213|1214|1215|1216|1217|1218|1219|1220|1221|1222)))(31:633|634|635|636|637|638|639|640|641|642|643|644|645|646|647|648|(3:650|651|652)|653|654|(3:656|657|658)|659|660|661|662|663|664|665|666|667|668|669)|670|671|672|(10:674|675|(1:677)(1:686)|678|679|680|681|(1:683)|684|685)|687|688|689|690|691|692|693|694)))(11:553|554|555|556|557|558|559|560|561|562|563))|1223|590|591|592|(0)|595|596|597|598|599|600|(0))(14:526|527|528|529|530|531|532|533|534|535|536|537|538|1e3d))(1:1229)|324|325)|450|451|452|453|454|455|456|457|458|459|460|461|462|463|464|465|466|467|468|469|470|471|472|473|474|475|476|477|478|479|480|481|482|483|484|485|486|487|488|489|324|325)(34:381|382|383|384|385|386|387|388|389|390|391|392|393|394|395|396|(5:425|426|427|428|429)(1:398)|399|400|401|402|403|404|405|406|407|408|409|(5:414|415|416|417|418)|419|420|421|422|423)|1236|1237|1238|1239)(20:353|354|355|356|357|358|359|360|361|362|363|364|365|366|367|368|369|370|371|372))|314|315|316|317|318|319|320|321|322|323|324|325)|269|270|271|272|273|274|275|276|277|278|279|280|281|282|283|284|285|286|287|288|289|290|(0)(0)|314|315|316|317|318|319|320|321|322|323|324|325) */
    /* JADX WARN: Code restructure failed: missing block: B:1230:0x1e0d, code lost:
    
        if (r356 == false) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x1069, code lost:
    
        if (android.text.TextUtils.equals(r0, "DISMISS") != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x1524, code lost:
    
        if (r306.AZk(r335) == false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x00ef. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1330:0x2ea8  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x1862 A[Catch: all -> 0x2dae, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x2dae, blocks: (B:273:0x17f6, B:274:0x17fc, B:275:0x1801, B:276:0x1807, B:277:0x180f, B:279:0x1815, B:280:0x181b, B:281:0x1823, B:283:0x1832, B:285:0x1838, B:286:0x183d, B:288:0x1846, B:289:0x184c, B:292:0x1862, B:293:0x1868, B:294:0x1870, B:295:0x1877, B:296:0x187e, B:297:0x1884, B:298:0x188b, B:299:0x1891, B:301:0x1899, B:303:0x18c1, B:305:0x18d2, B:306:0x18d6, B:309:0x18eb, B:311:0x18f2, B:312:0x18f6, B:315:0x1901, B:316:0x1908, B:317:0x1910, B:319:0x191b, B:321:0x1923, B:323:0x192a, B:327:0x1936, B:328:0x193d, B:329:0x1944, B:330:0x194a, B:332:0x1954, B:334:0x195e, B:336:0x1967, B:337:0x196e, B:338:0x1977, B:342:0x198c, B:343:0x1993, B:346:0x19a4, B:347:0x19ab, B:348:0x19b4, B:350:0x19bf, B:353:0x19ca, B:355:0x19db, B:357:0x19e4, B:358:0x19ea, B:359:0x19ef, B:361:0x19f5, B:362:0x19fc, B:363:0x1a03, B:364:0x1a09, B:365:0x1a0e, B:367:0x1a26, B:369:0x1a2c, B:370:0x1a30, B:371:0x1a35, B:373:0x1a41, B:378:0x1a52, B:381:0x1a5e, B:382:0x1a65, B:383:0x1a6e, B:384:0x1a75, B:385:0x1a7c, B:386:0x1a83, B:387:0x1a8a, B:389:0x1a93, B:391:0x1ac4, B:393:0x1ac9, B:395:0x1ace, B:400:0x1b15, B:402:0x1b1d, B:403:0x1b3e, B:404:0x1b47, B:405:0x1b4e, B:407:0x1b70, B:409:0x1b7c, B:411:0x1b86, B:414:0x1b92, B:415:0x1b98, B:416:0x1b9f, B:418:0x1ba7, B:420:0x1bad, B:421:0x1bb1, B:422:0x1bb6, B:426:0x1af8, B:428:0x1b03, B:429:0x1b0a, B:432:0x1b34, B:435:0x1bc7, B:437:0x1bce, B:440:0x1bdb, B:441:0x1be4, B:443:0x1bf5, B:445:0x1bfb, B:447:0x1c0e, B:449:0x1c18, B:451:0x1c1e, B:452:0x1c22, B:453:0x1c2a, B:454:0x1c31, B:455:0x1c37, B:456:0x1c3e, B:457:0x1c45, B:459:0x1c4e, B:461:0x1c7c, B:463:0x1c83, B:464:0x1c88, B:465:0x1c91, B:467:0x1c9d, B:469:0x1ca2, B:471:0x1cac, B:473:0x1cb8, B:475:0x1cc0, B:477:0x1cc6, B:479:0x1ccd, B:481:0x1cd4, B:483:0x1cdb, B:484:0x1ce1, B:485:0x1ce6, B:487:0x1d08, B:489:0x1d14, B:490:0x1d1b, B:491:0x1d21, B:494:0x1d2d, B:497:0x1d39, B:500:0x1d45, B:501:0x1d4c, B:502:0x1d55, B:504:0x1d63, B:507:0x1d84, B:508:0x1d8b, B:509:0x1d94, B:510:0x1d9b, B:513:0x1daa, B:517:0x1db7, B:520:0x1dc3, B:523:0x1dcf, B:526:0x1ddf, B:527:0x1de8, B:529:0x1dfa, B:531:0x1e10, B:533:0x1e26, B:535:0x1e31, B:536:0x1e36, B:539:0x1e3d, B:541:0x1e3e, B:544:0x1e45, B:550:0x1e52, B:553:0x1e5d, B:554:0x1e66, B:556:0x1e78, B:558:0x1e7f, B:560:0x1e93, B:562:0x1e9e, B:564:0x1ead, B:565:0x1eb4, B:566:0x1ebd, B:567:0x1ec4, B:570:0x1ed0, B:573:0x1edd, B:574:0x1ee4, B:575:0x1eed, B:577:0x1ef6, B:580:0x1f01, B:581:0x1f0a, B:583:0x1f1c, B:585:0x1f23, B:587:0x1f37, B:589:0x1f42, B:591:0x1f48, B:595:0x1f56, B:596:0x1f5f, B:598:0x1f6d, B:600:0x1f7a, B:605:0x1f8e, B:606:0x1f95, B:608:0x1f9e, B:609:0x1fa4, B:611:0x1fb2, B:612:0x1fb9, B:614:0x1fc3, B:615:0x1fca, B:616:0x1fd1, B:617:0x1fda, B:618:0x1fe1, B:620:0x1fee, B:622:0x1ff8, B:625:0x2002, B:627:0x200a, B:630:0x2014, B:633:0x2020, B:634:0x2027, B:635:0x2030, B:637:0x203c, B:639:0x2045, B:640:0x204c, B:641:0x2053, B:643:0x205c, B:644:0x2061, B:645:0x2068, B:646:0x206f, B:647:0x2076, B:650:0x2082, B:652:0x2090, B:653:0x2097, B:656:0x20a3, B:658:0x20b1, B:659:0x20b8, B:660:0x20bf, B:661:0x20c5, B:662:0x20cc, B:663:0x20d1, B:665:0x20dc, B:666:0x20e3, B:668:0x2124, B:669:0x212b, B:671:0x2131, B:674:0x213b, B:677:0x2145, B:678:0x214b, B:679:0x2151, B:680:0x2158, B:685:0x216a, B:688:0x2171, B:690:0x2176, B:691:0x217b, B:692:0x2183, B:694:0x218f, B:695:0x21a0, B:698:0x21ac, B:700:0x21be, B:703:0x21ca, B:706:0x21d6, B:707:0x21dc, B:708:0x21e3, B:710:0x21ef, B:712:0x2218, B:716:0x222b, B:717:0x2232, B:719:0x223b, B:720:0x2242, B:721:0x2249, B:722:0x2252, B:724:0x225b, B:725:0x2261, B:726:0x226a, B:728:0x2275, B:729:0x227c, B:730:0x2283, B:731:0x228c, B:732:0x2293, B:733:0x229a, B:735:0x22a7, B:736:0x22ae, B:738:0x22c1, B:740:0x22cc, B:742:0x22d5, B:744:0x22e1, B:745:0x22e8, B:747:0x22ef, B:749:0x22f6, B:752:0x2308, B:754:0x230f, B:757:0x2319, B:761:0x2326, B:767:0x23d8, B:769:0x23df, B:770:0x23e4, B:771:0x23ed, B:772:0x23f4, B:774:0x2401, B:776:0x2409, B:777:0x2410, B:779:0x2417, B:781:0x2423, B:783:0x2436, B:785:0x2441, B:786:0x2448, B:788:0x2456, B:790:0x2469, B:792:0x2470, B:794:0x247a, B:796:0x2483, B:798:0x248a, B:799:0x2491, B:800:0x2498, B:802:0x24b7, B:804:0x24bf, B:805:0x2335, B:806:0x233c, B:807:0x2345, B:808:0x234c, B:810:0x2358, B:812:0x2368, B:814:0x236f, B:815:0x2374, B:816:0x237d, B:817:0x2384, B:820:0x2390, B:821:0x2397, B:822:0x23a0, B:823:0x23a7, B:826:0x23b3, B:827:0x23bc, B:828:0x23c3, B:830:0x23cc, B:831:0x24c7, B:834:0x24d3, B:836:0x24de, B:837:0x24e7, B:839:0x24f0, B:842:0x24fb, B:843:0x2502, B:846:0x2715, B:848:0x2720, B:849:0x2729, B:851:0x2732, B:854:0x273e, B:855:0x2745, B:857:0x274f, B:858:0x2754, B:859:0x275d, B:860:0x2764, B:861:0x276b, B:862:0x2772, B:865:0x277e, B:866:0x2785, B:869:0x2791, B:870:0x279a, B:872:0x27ab, B:873:0x27b1, B:874:0x27ba, B:876:0x27c3, B:877:0x27ca, B:878:0x27d3, B:880:0x27dc, B:883:0x27e8, B:886:0x27f4, B:887:0x27fb, B:888:0x2800, B:889:0x2807, B:890:0x2810, B:891:0x2817, B:892:0x281e, B:893:0x2825, B:894:0x282b, B:895:0x2831, B:896:0x2838, B:898:0x286d, B:900:0x2873, B:901:0x2878, B:902:0x2881, B:903:0x2888, B:905:0x2895, B:906:0x289c, B:907:0x28a5, B:909:0x28b7, B:911:0x28bd, B:912:0x28c4, B:914:0x28cd, B:915:0x28d3, B:916:0x28da, B:917:0x28e3, B:919:0x28f5, B:922:0x2903, B:923:0x290a, B:924:0x2913, B:926:0x291c, B:928:0x2922, B:929:0x2927, B:930:0x2930, B:932:0x2941, B:935:0x294d, B:936:0x2956, B:938:0x2967, B:940:0x296d, B:941:0x2971, B:942:0x2979, B:943:0x2980, B:944:0x2986, B:945:0x298d, B:946:0x2994, B:948:0x299d, B:950:0x29cf, B:952:0x29dd, B:953:0x29e1, B:956:0x29f2, B:958:0x29f8, B:960:0x2a0b, B:962:0x2a15, B:963:0x2a1c, B:964:0x2a25, B:966:0x2a2e, B:968:0x2a3b, B:970:0x2a42, B:971:0x2a47, B:972:0x2a50, B:973:0x2a57, B:974:0x2a5e, B:975:0x2a67, B:977:0x2a79, B:978:0x2a80, B:979:0x2a87, B:982:0x2a93, B:984:0x2aa1, B:985:0x2aa8, B:987:0x2aaf, B:990:0x2abe, B:994:0x2acb, B:998:0x2ad9, B:1000:0x2ae0, B:1001:0x2ae5, B:1002:0x2aec, B:1003:0x2af1, B:1005:0x2afd, B:1007:0x2b06, B:1009:0x2b0e, B:1013:0x2b1d, B:1014:0x2b26, B:1015:0x2b2d, B:1017:0x2b36, B:1019:0x2b3f, B:1021:0x2b4a, B:1022:0x2b53, B:1024:0x2b5f, B:1026:0x2b68, B:1028:0x2b71, B:1030:0x2b7c, B:1031:0x2b85, B:1032:0x2b8c, B:1034:0x2b95, B:1036:0x2b9e, B:1038:0x2ba6, B:1042:0x2bb5, B:1043:0x2bbe, B:1044:0x2bc5, B:1046:0x2bce, B:1048:0x2bd7, B:1050:0x2be2, B:1051:0x2beb, B:1052:0x2bf2, B:1054:0x2bfb, B:1056:0x2c04, B:1058:0x2c0f, B:1059:0x2c18, B:1060:0x2c1f, B:1061:0x2c26, B:1062:0x2c2f, B:1063:0x2c36, B:1065:0x2c3f, B:1067:0x2c48, B:1069:0x2c50, B:1071:0x2c5e, B:1073:0x2c6f, B:1085:0x2d2b, B:1087:0x2d33, B:1089:0x2d42, B:1100:0x2d74, B:1104:0x2d94, B:1106:0x2da3, B:1110:0x2c77, B:1113:0x2c82, B:1116:0x2c8e, B:1119:0x2c99, B:1120:0x2ca0, B:1121:0x2ca9, B:1122:0x2cb0, B:1127:0x2cc4, B:1128:0x2ccb, B:1129:0x2cd4, B:1130:0x2cdb, B:1132:0x2ce7, B:1133:0x250e, B:1135:0x251a, B:1138:0x2525, B:1139:0x252c, B:1140:0x2535, B:1142:0x253e, B:1143:0x2544, B:1144:0x254d, B:1146:0x2558, B:1148:0x2564, B:1149:0x256a, B:1150:0x2571, B:1151:0x257a, B:1153:0x2583, B:1154:0x2589, B:1156:0x2597, B:1158:0x25aa, B:1160:0x25be, B:1162:0x25c6, B:1163:0x25cb, B:1164:0x25d4, B:1166:0x25e2, B:1167:0x25e9, B:1168:0x25f0, B:1169:0x25f9, B:1170:0x2600, B:1171:0x2607, B:1173:0x2614, B:1174:0x261b, B:1176:0x2629, B:1178:0x2632, B:1179:0x2637, B:1181:0x263c, B:1183:0x2643, B:1185:0x264a, B:1186:0x2651, B:1187:0x2658, B:1188:0x265f, B:1190:0x2666, B:1192:0x266d, B:1194:0x2678, B:1196:0x2684, B:1197:0x268b, B:1199:0x2692, B:1200:0x2697, B:1201:0x26a0, B:1202:0x26a7, B:1204:0x26b3, B:1206:0x26bc, B:1207:0x26c3, B:1209:0x26cd, B:1211:0x26d6, B:1213:0x26dd, B:1215:0x26e8, B:1217:0x26ef, B:1218:0x26f4, B:1219:0x26fd, B:1220:0x2704, B:1222:0x270d, B:1227:0x2da0, B:1231:0x1d71, B:1235:0x1d7d), top: B:272:0x17f6, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x1931  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0cf5  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x1e3e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:594:0x1f52  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x1f84  */
    /* JADX WARN: Type inference failed for: r0v2161, types: [java.lang.Object, X.50c] */
    /* JADX WARN: Type inference failed for: r0v2266, types: [androidx.core.app.NotificationCompat$BigTextStyle, X.4vI] */
    /* JADX WARN: Type inference failed for: r0v2277, types: [java.lang.Object, X.50c] */
    /* JADX WARN: Type inference failed for: r0v2819, types: [androidx.core.app.NotificationCompat$BigTextStyle, X.4vI] */
    /* JADX WARN: Type inference failed for: r0v29, types: [androidx.core.app.NotificationCompat$BigTextStyle, X.4vI] */
    /* JADX WARN: Type inference failed for: r0v739, types: [androidx.core.app.NotificationCompat$BigTextStyle, X.4vI] */
    @Override // X.InterfaceC04174a7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Bfa(com.facebook.messaging.notify.type.MessagingNotification r302) {
        /*
            Method dump skipped, instructions count: 13616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC04164a6.Bfa(com.facebook.messaging.notify.type.MessagingNotification):void");
    }
}
