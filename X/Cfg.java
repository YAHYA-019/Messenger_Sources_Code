package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;

/* loaded from: Cfg.class */
public final class Cfg implements 1Tu, CallerContextable {
    public static final CallerContext A0F = CallerContext.A06(Cfg.class);
    public static final String __redex_internal_original_name = "ContactsServiceHandler";
    public 1BY A00;
    public final Bzq A01;
    public final C6C A02;
    public final CMX A03;
    public final BwN A04;
    public final CHI A05;
    public final Bti A06;
    public final C1680Apm A07;
    public final C1678Apk A08;
    public final 1Rl A09;
    public final C11614x0 A0A;
    public final Byn A0B;
    public final C00i A0E;
    public final C00i A0D = 1BQ.A00();
    public final C00i A0C = 1BQ.A02(99721);

    public Cfg(1BO r302, FbUserSession fbUserSession) {
        this.A00 = 7zL.A0Q(r302);
        C1680Apm c1680Apm = (C1680Apm) 1Bn.A0E((Context) null, (1BY) null, 84581);
        C1678Apk c1678Apk = (C1678Apk) 1Bn.A0E((Context) null, (1BY) null, 84582);
        CMX cmx = (CMX) 1Bi.A03(84837);
        1Rl A0I = AbJ.A0I();
        C11614x0 c11614x0 = (C11614x0) 1Bi.A03(49370);
        C6C c6c = (C6C) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 84809);
        Bti bti = (Bti) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 84811);
        CHI chi = (CHI) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 84591);
        BwN bwN = (BwN) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 84810);
        Byn byn = (Byn) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 84798);
        Bzq bzq = (Bzq) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 84872);
        this.A0E = AbF.A0A(fbUserSession, (1BY) null, 84815);
        this.A01 = bzq;
        this.A07 = c1680Apm;
        this.A08 = c1678Apk;
        this.A03 = cmx;
        this.A09 = A0I;
        this.A0B = byn;
        this.A0A = c11614x0;
        this.A05 = chi;
        this.A04 = bwN;
        this.A02 = c6c;
        this.A06 = bti;
    }

    private boolean A00() {
        C00i c00i = this.A0D;
        if (!1BK.A0N(c00i).AZk(36326691655669538L)) {
            return false;
        }
        if (1BK.A0N(c00i).AZk(36326691655735075L)) {
            return FEO.A01((FEO) this.A0C.get());
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:548:0x0fae, code lost:
    
        if (r0.mContactProfileType == X.C1r4.A0B) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x041b, code lost:
    
        if (r0 == r0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:714:0x13d0  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x157b  */
    /* JADX WARN: Removed duplicated region for block: B:812:0x1615  */
    /* JADX WARN: Removed duplicated region for block: B:835:0x169c A[Catch: all -> 0x18fe, TRY_ENTER, TRY_LEAVE, TryCatch #18 {all -> 0x18fe, blocks: (B:564:0x1002, B:566:0x100c, B:568:0x1014, B:570:0x101e, B:572:0x1026, B:574:0x1030, B:576:0x1038, B:577:0x103f, B:579:0x1049, B:581:0x1051, B:582:0x1058, B:584:0x1062, B:586:0x106b, B:587:0x1072, B:589:0x107c, B:591:0x1085, B:593:0x108f, B:595:0x1098, B:597:0x10a2, B:599:0x10ab, B:601:0x10b5, B:603:0x10be, B:605:0x10cd, B:607:0x10d6, B:609:0x10e5, B:611:0x10ee, B:613:0x10fd, B:615:0x1106, B:617:0x1115, B:619:0x111e, B:620:0x1125, B:622:0x1134, B:624:0x113d, B:625:0x1144, B:627:0x114e, B:629:0x1157, B:631:0x1161, B:633:0x116a, B:635:0x1174, B:637:0x117b, B:638:0x1180, B:640:0x119f, B:641:0x11a6, B:642:0x11ad, B:645:0x11b9, B:646:0x11c0, B:647:0x11c7, B:648:0x11ce, B:649:0x11d5, B:650:0x11de, B:651:0x11e5, B:652:0x11ea, B:653:0x11f1, B:654:0x11f8, B:656:0x1205, B:657:0x120b, B:658:0x1212, B:659:0x1219, B:660:0x121f, B:662:0x1226, B:663:0x122b, B:666:0x1237, B:668:0x1241, B:670:0x1246, B:671:0x124d, B:673:0x1256, B:676:0x12ee, B:677:0x12f5, B:678:0x12fc, B:680:0x1305, B:682:0x130c, B:683:0x1311, B:687:0x132b, B:690:0x1343, B:692:0x134c, B:694:0x135f, B:696:0x1368, B:698:0x1371, B:700:0x137a, B:701:0x1381, B:703:0x1390, B:705:0x1399, B:706:0x13a0, B:708:0x13a9, B:709:0x13b0, B:711:0x13bf, B:716:0x13e4, B:718:0x13ed, B:720:0x1405, B:727:0x1424, B:729:0x142c, B:731:0x1435, B:733:0x1444, B:735:0x144d, B:737:0x145c, B:739:0x1465, B:741:0x1476, B:743:0x147f, B:745:0x1490, B:747:0x1499, B:749:0x14a8, B:751:0x14b9, B:753:0x14c2, B:755:0x14d3, B:757:0x14e4, B:759:0x14ed, B:761:0x14fe, B:763:0x1507, B:764:0x150e, B:767:0x1515, B:769:0x151f, B:771:0x1528, B:773:0x1539, B:775:0x1542, B:777:0x154c, B:779:0x1555, B:781:0x1566, B:783:0x156f, B:788:0x1598, B:790:0x15a1, B:792:0x15b2, B:794:0x15bb, B:795:0x15c2, B:797:0x15cc, B:799:0x15d5, B:801:0x15df, B:803:0x15e8, B:804:0x15ef, B:806:0x15f9, B:808:0x1600, B:809:0x1605, B:813:0x1616, B:816:0x161f, B:818:0x162e, B:820:0x1637, B:822:0x1641, B:824:0x164a, B:828:0x1676, B:830:0x167f, B:832:0x1689, B:835:0x169c, B:837:0x16a6, B:840:0x16c7, B:842:0x16cd, B:844:0x16d7, B:896:0x16ae, B:898:0x16b8, B:900:0x1659, B:902:0x1668, B:903:0x1587, B:906:0x158e, B:910:0x18e6, B:911:0x18ed, B:913:0x18f6, B:915:0x18fd, B:920:0x18ae, B:921:0x18b5, B:923:0x18be, B:927:0x18d2, B:930:0x1260, B:931:0x1269, B:932:0x1270, B:933:0x1279, B:935:0x1282, B:937:0x128b, B:939:0x1294, B:941:0x129b, B:942:0x12a2, B:944:0x12ab, B:945:0x12b2, B:950:0x12d7, B:952:0x12e2, B:723:0x140c, B:725:0x1413), top: B:563:0x1002, outer: #8, inners: #0, #5, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:848:0x16e5  */
    /* JADX WARN: Removed duplicated region for block: B:896:0x16ae A[Catch: all -> 0x18fe, TRY_ENTER, TRY_LEAVE, TryCatch #18 {all -> 0x18fe, blocks: (B:564:0x1002, B:566:0x100c, B:568:0x1014, B:570:0x101e, B:572:0x1026, B:574:0x1030, B:576:0x1038, B:577:0x103f, B:579:0x1049, B:581:0x1051, B:582:0x1058, B:584:0x1062, B:586:0x106b, B:587:0x1072, B:589:0x107c, B:591:0x1085, B:593:0x108f, B:595:0x1098, B:597:0x10a2, B:599:0x10ab, B:601:0x10b5, B:603:0x10be, B:605:0x10cd, B:607:0x10d6, B:609:0x10e5, B:611:0x10ee, B:613:0x10fd, B:615:0x1106, B:617:0x1115, B:619:0x111e, B:620:0x1125, B:622:0x1134, B:624:0x113d, B:625:0x1144, B:627:0x114e, B:629:0x1157, B:631:0x1161, B:633:0x116a, B:635:0x1174, B:637:0x117b, B:638:0x1180, B:640:0x119f, B:641:0x11a6, B:642:0x11ad, B:645:0x11b9, B:646:0x11c0, B:647:0x11c7, B:648:0x11ce, B:649:0x11d5, B:650:0x11de, B:651:0x11e5, B:652:0x11ea, B:653:0x11f1, B:654:0x11f8, B:656:0x1205, B:657:0x120b, B:658:0x1212, B:659:0x1219, B:660:0x121f, B:662:0x1226, B:663:0x122b, B:666:0x1237, B:668:0x1241, B:670:0x1246, B:671:0x124d, B:673:0x1256, B:676:0x12ee, B:677:0x12f5, B:678:0x12fc, B:680:0x1305, B:682:0x130c, B:683:0x1311, B:687:0x132b, B:690:0x1343, B:692:0x134c, B:694:0x135f, B:696:0x1368, B:698:0x1371, B:700:0x137a, B:701:0x1381, B:703:0x1390, B:705:0x1399, B:706:0x13a0, B:708:0x13a9, B:709:0x13b0, B:711:0x13bf, B:716:0x13e4, B:718:0x13ed, B:720:0x1405, B:727:0x1424, B:729:0x142c, B:731:0x1435, B:733:0x1444, B:735:0x144d, B:737:0x145c, B:739:0x1465, B:741:0x1476, B:743:0x147f, B:745:0x1490, B:747:0x1499, B:749:0x14a8, B:751:0x14b9, B:753:0x14c2, B:755:0x14d3, B:757:0x14e4, B:759:0x14ed, B:761:0x14fe, B:763:0x1507, B:764:0x150e, B:767:0x1515, B:769:0x151f, B:771:0x1528, B:773:0x1539, B:775:0x1542, B:777:0x154c, B:779:0x1555, B:781:0x1566, B:783:0x156f, B:788:0x1598, B:790:0x15a1, B:792:0x15b2, B:794:0x15bb, B:795:0x15c2, B:797:0x15cc, B:799:0x15d5, B:801:0x15df, B:803:0x15e8, B:804:0x15ef, B:806:0x15f9, B:808:0x1600, B:809:0x1605, B:813:0x1616, B:816:0x161f, B:818:0x162e, B:820:0x1637, B:822:0x1641, B:824:0x164a, B:828:0x1676, B:830:0x167f, B:832:0x1689, B:835:0x169c, B:837:0x16a6, B:840:0x16c7, B:842:0x16cd, B:844:0x16d7, B:896:0x16ae, B:898:0x16b8, B:900:0x1659, B:902:0x1668, B:903:0x1587, B:906:0x158e, B:910:0x18e6, B:911:0x18ed, B:913:0x18f6, B:915:0x18fd, B:920:0x18ae, B:921:0x18b5, B:923:0x18be, B:927:0x18d2, B:930:0x1260, B:931:0x1269, B:932:0x1270, B:933:0x1279, B:935:0x1282, B:937:0x128b, B:939:0x1294, B:941:0x129b, B:942:0x12a2, B:944:0x12ab, B:945:0x12b2, B:950:0x12d7, B:952:0x12e2, B:723:0x140c, B:725:0x1413), top: B:563:0x1002, outer: #8, inners: #0, #5, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:899:0x1670  */
    /* JADX WARN: Removed duplicated region for block: B:900:0x1659 A[Catch: all -> 0x18fe, TRY_ENTER, TRY_LEAVE, TryCatch #18 {all -> 0x18fe, blocks: (B:564:0x1002, B:566:0x100c, B:568:0x1014, B:570:0x101e, B:572:0x1026, B:574:0x1030, B:576:0x1038, B:577:0x103f, B:579:0x1049, B:581:0x1051, B:582:0x1058, B:584:0x1062, B:586:0x106b, B:587:0x1072, B:589:0x107c, B:591:0x1085, B:593:0x108f, B:595:0x1098, B:597:0x10a2, B:599:0x10ab, B:601:0x10b5, B:603:0x10be, B:605:0x10cd, B:607:0x10d6, B:609:0x10e5, B:611:0x10ee, B:613:0x10fd, B:615:0x1106, B:617:0x1115, B:619:0x111e, B:620:0x1125, B:622:0x1134, B:624:0x113d, B:625:0x1144, B:627:0x114e, B:629:0x1157, B:631:0x1161, B:633:0x116a, B:635:0x1174, B:637:0x117b, B:638:0x1180, B:640:0x119f, B:641:0x11a6, B:642:0x11ad, B:645:0x11b9, B:646:0x11c0, B:647:0x11c7, B:648:0x11ce, B:649:0x11d5, B:650:0x11de, B:651:0x11e5, B:652:0x11ea, B:653:0x11f1, B:654:0x11f8, B:656:0x1205, B:657:0x120b, B:658:0x1212, B:659:0x1219, B:660:0x121f, B:662:0x1226, B:663:0x122b, B:666:0x1237, B:668:0x1241, B:670:0x1246, B:671:0x124d, B:673:0x1256, B:676:0x12ee, B:677:0x12f5, B:678:0x12fc, B:680:0x1305, B:682:0x130c, B:683:0x1311, B:687:0x132b, B:690:0x1343, B:692:0x134c, B:694:0x135f, B:696:0x1368, B:698:0x1371, B:700:0x137a, B:701:0x1381, B:703:0x1390, B:705:0x1399, B:706:0x13a0, B:708:0x13a9, B:709:0x13b0, B:711:0x13bf, B:716:0x13e4, B:718:0x13ed, B:720:0x1405, B:727:0x1424, B:729:0x142c, B:731:0x1435, B:733:0x1444, B:735:0x144d, B:737:0x145c, B:739:0x1465, B:741:0x1476, B:743:0x147f, B:745:0x1490, B:747:0x1499, B:749:0x14a8, B:751:0x14b9, B:753:0x14c2, B:755:0x14d3, B:757:0x14e4, B:759:0x14ed, B:761:0x14fe, B:763:0x1507, B:764:0x150e, B:767:0x1515, B:769:0x151f, B:771:0x1528, B:773:0x1539, B:775:0x1542, B:777:0x154c, B:779:0x1555, B:781:0x1566, B:783:0x156f, B:788:0x1598, B:790:0x15a1, B:792:0x15b2, B:794:0x15bb, B:795:0x15c2, B:797:0x15cc, B:799:0x15d5, B:801:0x15df, B:803:0x15e8, B:804:0x15ef, B:806:0x15f9, B:808:0x1600, B:809:0x1605, B:813:0x1616, B:816:0x161f, B:818:0x162e, B:820:0x1637, B:822:0x1641, B:824:0x164a, B:828:0x1676, B:830:0x167f, B:832:0x1689, B:835:0x169c, B:837:0x16a6, B:840:0x16c7, B:842:0x16cd, B:844:0x16d7, B:896:0x16ae, B:898:0x16b8, B:900:0x1659, B:902:0x1668, B:903:0x1587, B:906:0x158e, B:910:0x18e6, B:911:0x18ed, B:913:0x18f6, B:915:0x18fd, B:920:0x18ae, B:921:0x18b5, B:923:0x18be, B:927:0x18d2, B:930:0x1260, B:931:0x1269, B:932:0x1270, B:933:0x1279, B:935:0x1282, B:937:0x128b, B:939:0x1294, B:941:0x129b, B:942:0x12a2, B:944:0x12ab, B:945:0x12b2, B:950:0x12d7, B:952:0x12e2, B:723:0x140c, B:725:0x1413), top: B:563:0x1002, outer: #8, inners: #0, #5, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:903:0x1587 A[Catch: all -> 0x18fe, TRY_ENTER, TRY_LEAVE, TryCatch #18 {all -> 0x18fe, blocks: (B:564:0x1002, B:566:0x100c, B:568:0x1014, B:570:0x101e, B:572:0x1026, B:574:0x1030, B:576:0x1038, B:577:0x103f, B:579:0x1049, B:581:0x1051, B:582:0x1058, B:584:0x1062, B:586:0x106b, B:587:0x1072, B:589:0x107c, B:591:0x1085, B:593:0x108f, B:595:0x1098, B:597:0x10a2, B:599:0x10ab, B:601:0x10b5, B:603:0x10be, B:605:0x10cd, B:607:0x10d6, B:609:0x10e5, B:611:0x10ee, B:613:0x10fd, B:615:0x1106, B:617:0x1115, B:619:0x111e, B:620:0x1125, B:622:0x1134, B:624:0x113d, B:625:0x1144, B:627:0x114e, B:629:0x1157, B:631:0x1161, B:633:0x116a, B:635:0x1174, B:637:0x117b, B:638:0x1180, B:640:0x119f, B:641:0x11a6, B:642:0x11ad, B:645:0x11b9, B:646:0x11c0, B:647:0x11c7, B:648:0x11ce, B:649:0x11d5, B:650:0x11de, B:651:0x11e5, B:652:0x11ea, B:653:0x11f1, B:654:0x11f8, B:656:0x1205, B:657:0x120b, B:658:0x1212, B:659:0x1219, B:660:0x121f, B:662:0x1226, B:663:0x122b, B:666:0x1237, B:668:0x1241, B:670:0x1246, B:671:0x124d, B:673:0x1256, B:676:0x12ee, B:677:0x12f5, B:678:0x12fc, B:680:0x1305, B:682:0x130c, B:683:0x1311, B:687:0x132b, B:690:0x1343, B:692:0x134c, B:694:0x135f, B:696:0x1368, B:698:0x1371, B:700:0x137a, B:701:0x1381, B:703:0x1390, B:705:0x1399, B:706:0x13a0, B:708:0x13a9, B:709:0x13b0, B:711:0x13bf, B:716:0x13e4, B:718:0x13ed, B:720:0x1405, B:727:0x1424, B:729:0x142c, B:731:0x1435, B:733:0x1444, B:735:0x144d, B:737:0x145c, B:739:0x1465, B:741:0x1476, B:743:0x147f, B:745:0x1490, B:747:0x1499, B:749:0x14a8, B:751:0x14b9, B:753:0x14c2, B:755:0x14d3, B:757:0x14e4, B:759:0x14ed, B:761:0x14fe, B:763:0x1507, B:764:0x150e, B:767:0x1515, B:769:0x151f, B:771:0x1528, B:773:0x1539, B:775:0x1542, B:777:0x154c, B:779:0x1555, B:781:0x1566, B:783:0x156f, B:788:0x1598, B:790:0x15a1, B:792:0x15b2, B:794:0x15bb, B:795:0x15c2, B:797:0x15cc, B:799:0x15d5, B:801:0x15df, B:803:0x15e8, B:804:0x15ef, B:806:0x15f9, B:808:0x1600, B:809:0x1605, B:813:0x1616, B:816:0x161f, B:818:0x162e, B:820:0x1637, B:822:0x1641, B:824:0x164a, B:828:0x1676, B:830:0x167f, B:832:0x1689, B:835:0x169c, B:837:0x16a6, B:840:0x16c7, B:842:0x16cd, B:844:0x16d7, B:896:0x16ae, B:898:0x16b8, B:900:0x1659, B:902:0x1668, B:903:0x1587, B:906:0x158e, B:910:0x18e6, B:911:0x18ed, B:913:0x18f6, B:915:0x18fd, B:920:0x18ae, B:921:0x18b5, B:923:0x18be, B:927:0x18d2, B:930:0x1260, B:931:0x1269, B:932:0x1270, B:933:0x1279, B:935:0x1282, B:937:0x128b, B:939:0x1294, B:941:0x129b, B:942:0x12a2, B:944:0x12ab, B:945:0x12b2, B:950:0x12d7, B:952:0x12e2, B:723:0x140c, B:725:0x1413), top: B:563:0x1002, outer: #8, inners: #0, #5, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:928:0x13db  */
    /* JADX WARN: Type inference failed for: r0v1042, types: [X.Aoi, java.lang.Object, X.2V0] */
    /* JADX WARN: Type inference failed for: r0v1351, types: [java.util.concurrent.Future, com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r0v1352, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v1357, types: [X.4mh] */
    /* JADX WARN: Type inference failed for: r0v1393, types: [java.lang.Throwable, X.DAr] */
    /* JADX WARN: Type inference failed for: r0v1408, types: [java.lang.Throwable, com.facebook.graphql.enums.GraphQLContactRelationshipStatus] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.Byn] */
    /* JADX WARN: Type inference failed for: r0v347, types: [java.lang.Object, X.1tl] */
    /* JADX WARN: Type inference failed for: r0v379, types: [X.1tm] */
    /* JADX WARN: Type inference failed for: r0v696, types: [X.1tm] */
    /* JADX WARN: Type inference failed for: r0v721, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v726, types: [X.Byn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.fbservice.service.OperationResult BMQ(X.1TC r302) {
        /*
            Method dump skipped, instructions count: 6736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cfg.BMQ(X.1TC):com.facebook.fbservice.service.OperationResult");
    }
}
