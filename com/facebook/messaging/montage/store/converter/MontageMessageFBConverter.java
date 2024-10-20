package com.facebook.messaging.montage.store.converter;

import X.1BJ;
import X.1BO;
import X.1BQ;
import X.1BY;
import X.1Bi;
import X.1HU;
import X.1Hv;
import X.1IJ;
import X.2JX;
import X.2JZ;
import X.2tS;
import X.3PR;
import X.4EZ;
import X.4YT;
import X.4YU;
import X.60V;
import X.6As;
import X.7zL;
import X.7zP;
import X.AbF;
import X.AbN;
import X.AbO;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.C00i;
import X.C2fx;
import X.C4Ed;
import X.GOn;
import X.GOp;
import X.GhC;
import X.H7f;
import X.H8R;
import X.He9;
import X.JQw;
import X.MRk;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeBuilderJNI;
import com.facebook.messaging.model.attachment.ImageUrl;
import com.facebook.messaging.montage.model.cards.MontageStickerOverlayBounds;
import com.facebook.messenger.plugins.msysopenmessagingattachmentdeletionplugin.MsysOpenMessagingAttachmentDeletionPluginPostmailbox;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: MontageMessageFBConverter.class */
public final class MontageMessageFBConverter {
    public 1BY A00;
    public final C2fx A03 = (C2fx) 1Bi.A03(67920);
    public final C00i A01 = 1BQ.A01();
    public final 60V A02 = (60V) 1Hv.A02(7zP.A0J(), 66579);

    public MontageMessageFBConverter(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static byte A00(1HU r301, int i) {
        int A07 = r301.A07(i);
        if (A07 != 0) {
            return r301.A01.get(A07 + r301.A00);
        }
        return (byte) 0;
    }

    public static int A01(1HU r301, int i) {
        return r301.A01.getInt(i + r301.A00);
    }

    public static int A02(1HU r301, int i) {
        int A07 = r301.A07(i);
        if (A07 != 0) {
            return r301.A09(A07);
        }
        return 0;
    }

    public static int A03(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i + i2;
        return byteBuffer.getInt(i3 + byteBuffer.getInt(i3));
    }

    /* JADX WARN: Type inference failed for: r0v112, types: [X.1HU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v130, types: [X.1HU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v196, types: [X.1HU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v259, types: [X.1HU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v291, types: [X.1HU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [X.1HU, java.lang.Object] */
    public static 4EZ A04(H7f h7f) {
        ImmutableList immutableList;
        ImmutableList immutableList2;
        ImmutableList immutableList3;
        short s;
        short s2;
        short s3;
        short s4;
        short s5;
        short s6;
        short s7;
        short s8;
        short s9;
        short A0p;
        int A07 = h7f.A07(14);
        if (A07 == 0) {
            return null;
        }
        int A03 = AbN.A03(h7f, A07);
        ByteBuffer byteBuffer = ((1HU) h7f).A01;
        Object obj = 2JZ.A01;
        TreeBuilderJNI A0N = AbF.A0N(2tS.A00(), 6As.class, "TextWithEntities", -684097254);
        int A08 = AbstractC2326GOr.A08(byteBuffer, A03);
        A0N.setString("text", (6 >= byteBuffer.getShort(A08) || (A0p = AbstractC2326GOr.A0p(byteBuffer, A08)) == 0) ? null : A0B(byteBuffer, A0p, A03));
        int A082 = AbstractC2326GOr.A08(byteBuffer, A03);
        if (8 >= byteBuffer.getShort(A082) || (s7 = byteBuffer.getShort(A082 + 8)) == 0 || A03(byteBuffer, s7, A03) <= 0) {
            immutableList = null;
        } else {
            ImmutableList.Builder A0h = 4YU.A0h();
            int i = 0;
            while (true) {
                int A083 = AbstractC2326GOr.A08(byteBuffer, A03);
                if (i >= ((8 >= byteBuffer.getShort(A083) || (s9 = byteBuffer.getShort(A083 + 8)) == 0) ? 0 : A03(byteBuffer, s9, A03))) {
                    break;
                }
                ?? obj2 = new Object();
                int A084 = AbstractC2326GOr.A08(byteBuffer, A03);
                if (8 < byteBuffer.getShort(A084) && (s8 = byteBuffer.getShort(A084 + 8)) != 0) {
                    A0G(obj2, byteBuffer, s8, A03, i);
                    6As A0N2 = GOn.A0N(2tS.A00(), MRk.A00(8), 1207192005);
                    A0N2.A08("offset", AbN.A02((1HU) obj2, obj2.A07(6)));
                    A0N2.A08("length", AbN.A02((1HU) obj2, obj2.A04()));
                    ?? obj3 = new Object();
                    int A072 = obj2.A07(8);
                    if (A072 != 0) {
                        AbN.A1S((1HU) obj2, (1HU) obj3, A072);
                        TreeBuilderJNI A0N3 = AbF.A0N(2tS.A00(), 6As.class, AbstractC2327GOs.A0R(obj3), -1116323448);
                        A0N3.setString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0A(obj3, 6));
                        A0N2.setTree(1BJ.A00(91), GOp.A0G(A0N3, "url", A0A(obj3, 8), -1116323448));
                    }
                    A0h.m11011add((Object) A0N2.getResult(2JX.class, 1207192005));
                }
                i++;
            }
            immutableList = A0h.build();
        }
        A0N.setTreeList("ranges", (Iterable) immutableList);
        int A085 = AbstractC2326GOr.A08(byteBuffer, A03);
        if (10 >= byteBuffer.getShort(A085) || (s4 = byteBuffer.getShort(A085 + 10)) == 0 || A03(byteBuffer, s4, A03) <= 0) {
            immutableList2 = null;
        } else {
            ImmutableList.Builder A0h2 = 4YU.A0h();
            int i2 = 0;
            while (true) {
                int A086 = AbstractC2326GOr.A08(byteBuffer, A03);
                if (i2 >= ((10 >= byteBuffer.getShort(A086) || (s6 = byteBuffer.getShort(A086 + 10)) == 0) ? 0 : A03(byteBuffer, s6, A03))) {
                    break;
                }
                ?? obj4 = new Object();
                int A087 = AbstractC2326GOr.A08(byteBuffer, A03);
                if (10 < byteBuffer.getShort(A087) && (s5 = byteBuffer.getShort(A087 + 10)) != 0) {
                    A0G(obj4, byteBuffer, s5, A03, i2);
                    6As A0N4 = GOn.A0N(2tS.A00(), MRk.A00(28), 197574311);
                    A0N4.A08("length", AbN.A02((1HU) obj4, obj4.A07(6)));
                    A0N4.A08("offset", AbN.A02((1HU) obj4, obj4.A04()));
                    A0h2.m11011add((Object) A0N4.getResult(2JX.class, 197574311));
                }
                i2++;
            }
            immutableList2 = A0h2.build();
        }
        A0N.setTreeList("aggregated_ranges", (Iterable) immutableList2);
        int A088 = AbstractC2326GOr.A08(byteBuffer, A03);
        if (12 >= byteBuffer.getShort(A088) || (s = byteBuffer.getShort(A088 + 12)) == 0 || A03(byteBuffer, s, A03) <= 0) {
            immutableList3 = null;
        } else {
            ImmutableList.Builder A0h3 = 4YU.A0h();
            int i3 = 0;
            while (true) {
                int A089 = AbstractC2326GOr.A08(byteBuffer, A03);
                if (i3 >= ((12 >= byteBuffer.getShort(A089) || (s3 = byteBuffer.getShort(A089 + 12)) == 0) ? 0 : A03(byteBuffer, s3, A03))) {
                    break;
                }
                ?? obj5 = new Object();
                int A0810 = AbstractC2326GOr.A08(byteBuffer, A03);
                if (12 < byteBuffer.getShort(A0810) && (s2 = byteBuffer.getShort(A0810 + 12)) != 0) {
                    A0G(obj5, byteBuffer, s2, A03, i3);
                    6As A0N5 = GOn.A0N(2tS.A00(), MRk.A00(34), -1027164784);
                    A0N5.A08("offset", AbN.A02((1HU) obj5, obj5.A04()));
                    A0N5.A08("length", AbN.A02((1HU) obj5, obj5.A07(6)));
                    ?? obj6 = new Object();
                    int A032 = obj5.A03();
                    if (A032 != 0) {
                        AbN.A1S((1HU) obj5, (1HU) obj6, A032);
                        TreeBuilderJNI A0N6 = AbF.A0N(2tS.A00(), 6As.class, A0A(obj6, 6), -580851045);
                        ?? obj7 = new Object();
                        int A04 = obj6.A04();
                        if (A04 != 0) {
                            AbN.A1S((1HU) obj6, (1HU) obj7, A04);
                            6As A0N7 = GOn.A0N(2tS.A00(), "Image", -1725656266);
                            A0N7.setString(TraceFieldType.Uri, AbstractC2327GOs.A0R(obj7));
                            A0N7.A08(Property.ICON_TEXT_FIT_WIDTH, AbN.A02((1HU) obj7, obj7.A07(6)));
                            A0N7.A08(Property.ICON_TEXT_FIT_HEIGHT, AbN.A02((1HU) obj7, obj7.A03()));
                            A0N6.setTree("image", GOp.A0G(A0N7, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, AbN.A0m((1HU) obj7, obj7.A06()), -1725656266));
                        }
                        A0N5.setTree("entity_with_image", A0N6.getResult(2JX.class, -580851045));
                    }
                    A0h3.m11011add((Object) A0N5.getResult(2JX.class, -1027164784));
                }
                i3++;
            }
            immutableList3 = A0h3.build();
        }
        A0N.setTreeList("image_ranges", (Iterable) immutableList3);
        return A0N.getResult(4EZ.class, -684097254);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1HU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.1HU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [X.1HU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r307v41, types: [X.1HU, java.lang.Object] */
    public static C4Ed A05(H7f h7f) {
        Tree tree;
        Tree tree2;
        Tree tree3;
        Tree tree4;
        short s;
        short A0p;
        short A0o;
        short A0o2;
        1HU r307;
        ?? obj = new Object();
        int A04 = h7f.A04();
        if (A04 == 0) {
            return null;
        }
        AbN.A1S(h7f, (1HU) obj, A04);
        Object obj2 = 2JZ.A01;
        TreeBuilderJNI A0N = AbF.A0N(2tS.A00(), 6As.class, MRk.A00(11), 1530798005);
        A0N.setString("color", AbstractC2327GOs.A0R(obj));
        A0N.setString("background_color", AbN.A0m((1HU) obj, obj.A05()));
        A0N.setString(JQw.A00(69), AbN.A0m((1HU) obj, obj.A03()));
        A0N.setString(JQw.A00(70), AbN.A0m((1HU) obj, obj.A06()));
        ?? obj3 = new Object();
        int A07 = obj.A07(12);
        if (A07 != 0) {
            AbN.A1S((1HU) obj, (1HU) obj3, A07);
            tree = GOp.A0G(AbF.A0N(2tS.A00(), 6As.class, "Image", 1953763184), TraceFieldType.Uri, AbstractC2327GOs.A0R(obj3), 1953763184);
        } else {
            tree = null;
        }
        A0N.setTree(MRk.A00(51), tree);
        A0N.setString("background_image_name", A0A(obj, 14));
        A0N.setString(JQw.A00(82), A0A(obj, 18));
        ?? obj4 = new Object();
        int A072 = obj.A07(20);
        if (A072 != 0) {
            AbN.A1S((1HU) obj, (1HU) obj4, A072);
            6As A0N2 = GOn.A0N(2tS.A00(), MRk.A00(35), 1696781739);
            A0N2.setString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, AbstractC2327GOs.A0R(obj4));
            A0N2.setString("font_url", AbN.A0m((1HU) obj4, obj4.A05()));
            A0N2.setString("font_name", AbN.A0m((1HU) obj4, obj4.A03()));
            A0N2.setString("font_icon_url", AbN.A0m((1HU) obj4, obj4.A06()));
            A0N2.setString("font_postscript_name", A0A(obj4, 12));
            A0N2.A08("maximum_font_size", AbN.A02((1HU) obj4, obj4.A07(14)));
            A0N2.A08("minimum_font_size", AbN.A02((1HU) obj4, obj4.A07(16)));
            int A073 = obj4.A07(18);
            if (A073 != 0) {
                A0E(obj4, A073);
                TreeBuilderJNI A0N3 = AbF.A0N(2tS.A00(), 6As.class, "TextWithEntities", 356273527);
                ?? obj5 = new Object();
                int A074 = obj4.A07(18);
                if (A074 != 0) {
                    AbN.A1S((1HU) obj4, (1HU) obj5, A074);
                    r307 = obj5;
                } else {
                    r307 = null;
                }
                A0N2.setTree("font_display_name", GOp.A0G(A0N3, "text", AbstractC2327GOs.A0R(r307), 356273527));
            }
            tree2 = A0N2.getResult(2JX.class, 1696781739);
        } else {
            tree2 = null;
        }
        A0N.setTree("inspirations_custom_font_object", tree2);
        A0N.setString(JQw.A00(98), A0A(obj, 22));
        int A075 = obj.A07(24);
        if (A075 != 0) {
            int A03 = AbN.A03((1HU) obj, A075);
            ByteBuffer byteBuffer = ((1HU) obj).A01;
            TreeBuilderJNI A0N4 = AbF.A0N(2tS.A00(), 6As.class, "Image", -758954775);
            int A08 = AbstractC2326GOr.A08(byteBuffer, A03);
            tree3 = GOp.A0G(A0N4, TraceFieldType.Uri, (4 >= byteBuffer.getShort(A08) || (A0o2 = AbstractC2326GOr.A0o(byteBuffer, A08)) == 0) ? null : A0B(byteBuffer, A0o2, A03), -758954775);
        } else {
            tree3 = null;
        }
        A0N.setTree("portrait_background_image", tree3);
        int A076 = obj.A07(26);
        if (A076 != 0) {
            int A032 = AbN.A03((1HU) obj, A076);
            ByteBuffer byteBuffer2 = ((1HU) obj).A01;
            TreeBuilderJNI A0N5 = AbF.A0N(2tS.A00(), 6As.class, MRk.A00(30), -1039116531);
            int A082 = AbstractC2326GOr.A08(byteBuffer2, A032);
            A0N5.setString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (4 >= byteBuffer2.getShort(A082) || (A0o = AbstractC2326GOr.A0o(byteBuffer2, A082)) == 0) ? null : A0B(byteBuffer2, A0o, A032));
            int A083 = AbstractC2326GOr.A08(byteBuffer2, A032);
            A0N5.setString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (6 >= byteBuffer2.getShort(A083) || (A0p = AbstractC2326GOr.A0p(byteBuffer2, A083)) == 0) ? null : A0B(byteBuffer2, A0p, A032));
            int A084 = AbstractC2326GOr.A08(byteBuffer2, A032);
            tree4 = GOp.A0G(A0N5, "animation_uri", (8 >= byteBuffer2.getShort(A084) || (s = byteBuffer2.getShort(A084 + 8)) == 0) ? null : A0B(byteBuffer2, s, A032), -1039116531);
        } else {
            tree4 = null;
        }
        A0N.setTree("portrait_keyframes_animation", tree4);
        A0N.setString("text_align", A0A(obj, 28));
        return (C4Ed) A0N.getResult(C4Ed.class, 1530798005);
    }

    public static ImageUrl A06(He9 he9, String str) {
        he9.A02 = 3PR.A00(str);
        return new ImageUrl(he9);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.messaging.montage.model.cards.MontageStickerOverlayBounds$MontageStickerOverlayBoundsBuilder, java.lang.Object] */
    public static MontageStickerOverlayBounds A07(H8R h8r) {
        ?? obj = new Object();
        obj.A00 = h8r.A0E();
        obj.A01 = h8r.A0F();
        obj.A04 = h8r.A0D();
        obj.A02 = h8r.A0B();
        obj.A03 = h8r.A0C();
        return obj.A00();
    }

    public static MontageStickerOverlayBounds A08(H8R h8r) {
        double A05;
        double A052;
        double A053;
        double A054;
        double d = 0.0d;
        if (h8r == null) {
            A05 = 0.0d;
            A052 = 0.0d;
            A053 = 0.0d;
            A054 = 0.0d;
        } else {
            A05 = AbstractC2327GOs.A05(h8r, h8r.A04());
            A052 = AbstractC2327GOs.A05(h8r, h8r.A05());
            A053 = AbstractC2327GOs.A05(h8r, h8r.A03());
            A054 = AbstractC2327GOs.A05(h8r, h8r.A06());
            d = AbO.A00(h8r, 12);
        }
        return new MontageStickerOverlayBounds(A05, A052, A053, A054, d);
    }

    /* JADX WARN: Type inference failed for: r0v104, types: [X.1HU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.1HU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v161, types: [X.1HU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v244, types: [X.1HU, java.lang.Object] */
    public static ImmutableList A09(H7f h7f) {
        int A09;
        Tree tree;
        Tree tree2;
        Tree tree3;
        Tree tree4;
        Tree tree5;
        ImmutableList immutableList;
        short s;
        short A0p;
        short A0o;
        short s2;
        short A0o2;
        short A0p2;
        short A0o3;
        short A0o4;
        short A0o5;
        int A05 = h7f.A05();
        if (A05 == 0 || (A09 = h7f.A09(A05)) == 0) {
            return null;
        }
        ImmutableList.Builder A0h = 4YU.A0h();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A09) {
                return A0h.build();
            }
            ?? obj = new Object();
            int A07 = h7f.A07(6);
            if (A07 != 0) {
                AbstractC2326GOr.A1L(h7f, obj, 1HU.A00(h7f, A07, i2));
                Object obj2 = 2JZ.A01;
                TreeBuilderJNI A0N = AbF.A0N(2tS.A00(), 6As.class, "StoryAttachment", -978801287);
                int A072 = obj.A07(4);
                if (A072 != 0) {
                    int A03 = AbN.A03((1HU) obj, A072);
                    ByteBuffer byteBuffer = ((1HU) obj).A01;
                    TreeBuilderJNI A0N2 = AbF.A0N(2tS.A00(), 6As.class, "TextWithEntities", 35134020);
                    int A08 = AbstractC2326GOr.A08(byteBuffer, A03);
                    tree = GOp.A0G(A0N2, "text", (4 >= byteBuffer.getShort(A08) || (A0o5 = AbstractC2326GOr.A0o(byteBuffer, A08)) == 0) ? null : A0B(byteBuffer, A0o5, A03), 35134020);
                } else {
                    tree = null;
                }
                A0N.setTree(MRk.A00(26), tree);
                int A073 = obj.A07(6);
                if (A073 != 0) {
                    int A032 = AbN.A03((1HU) obj, A073);
                    ByteBuffer byteBuffer2 = ((1HU) obj).A01;
                    TreeBuilderJNI A0N3 = AbF.A0N(2tS.A00(), 6As.class, "TextWithEntities", -1247889134);
                    int A082 = AbstractC2326GOr.A08(byteBuffer2, A032);
                    tree2 = GOp.A0G(A0N3, "text", (4 >= byteBuffer2.getShort(A082) || (A0o4 = AbstractC2326GOr.A0o(byteBuffer2, A082)) == 0) ? null : A0B(byteBuffer2, A0o4, A032), -1247889134);
                } else {
                    tree2 = null;
                }
                A0N.setTree("description", tree2);
                int A033 = obj.A03();
                if (A033 != 0) {
                    int A034 = AbN.A03((1HU) obj, A033);
                    ByteBuffer byteBuffer3 = ((1HU) obj).A01;
                    TreeBuilderJNI A0N4 = AbF.A0N(2tS.A00(), 6As.class, "TextWithEntities", 620886187);
                    int A083 = AbstractC2326GOr.A08(byteBuffer3, A034);
                    tree3 = GOp.A0G(A0N4, "text", (4 >= byteBuffer3.getShort(A083) || (A0o3 = AbstractC2326GOr.A0o(byteBuffer3, A083)) == 0) ? null : A0B(byteBuffer3, A0o3, A034), 620886187);
                } else {
                    tree3 = null;
                }
                A0N.setTree(Property.SYMBOL_Z_ORDER_SOURCE, tree3);
                int A06 = obj.A06();
                if (A06 != 0) {
                    int A035 = AbN.A03((1HU) obj, A06);
                    ByteBuffer byteBuffer4 = ((1HU) obj).A01;
                    int A084 = AbstractC2326GOr.A08(byteBuffer4, A035);
                    TreeBuilderJNI A0N5 = AbF.A0N(2tS.A00(), 6As.class, (6 >= byteBuffer4.getShort(A084) || (A0p2 = AbstractC2326GOr.A0p(byteBuffer4, A084)) == 0) ? null : A0B(byteBuffer4, A0p2, A035), -671771564);
                    ?? obj3 = new Object();
                    int A085 = AbstractC2326GOr.A08(byteBuffer4, A035);
                    if (4 < byteBuffer4.getShort(A085) && (A0o2 = AbstractC2326GOr.A0o(byteBuffer4, A085)) != 0) {
                        ((1HU) obj3).A00 = AbstractC2326GOr.A09(byteBuffer4, A0o2, A035);
                        ((1HU) obj3).A01 = byteBuffer4;
                        A0N5.setTree(4YT.A00(1173), GOp.A0G(AbF.A0N(2tS.A00(), 6As.class, MRk.A00(2), -367490715), PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0A(obj3, 4), -367490715));
                    }
                    tree4 = A0N5.getResult(2JX.class, -671771564);
                } else {
                    tree4 = null;
                }
                A0N.setTree("target", tree4);
                A0N.setString("url", A0A(obj, 12));
                int A074 = obj.A07(14);
                if (A074 != 0) {
                    int A036 = AbN.A03((1HU) obj, A074);
                    ByteBuffer byteBuffer5 = ((1HU) obj).A01;
                    int A086 = AbstractC2326GOr.A08(byteBuffer5, A036);
                    TreeBuilderJNI A0N6 = AbF.A0N(2tS.A00(), 6As.class, (12 >= byteBuffer5.getShort(A086) || (s2 = byteBuffer5.getShort(A086 + 12)) == 0) ? null : A0B(byteBuffer5, s2, A036), 1758109738);
                    int A087 = AbstractC2326GOr.A08(byteBuffer5, A036);
                    A0N6.setString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (4 >= byteBuffer5.getShort(A087) || (A0o = AbstractC2326GOr.A0o(byteBuffer5, A087)) == 0) ? null : A0B(byteBuffer5, A0o, A036));
                    ?? obj4 = new Object();
                    int A088 = AbstractC2326GOr.A08(byteBuffer5, A036);
                    if (6 < byteBuffer5.getShort(A088) && (A0p = AbstractC2326GOr.A0p(byteBuffer5, A088)) != 0) {
                        ((1HU) obj4).A00 = AbstractC2326GOr.A09(byteBuffer5, A0p, A036);
                        ((1HU) obj4).A01 = byteBuffer5;
                        6As A0N7 = GOn.A0N(2tS.A00(), "Image", 1974585833);
                        A0N7.A08(Property.ICON_TEXT_FIT_WIDTH, AbN.A02((1HU) obj4, obj4.A07(4)));
                        A0N7.A08(Property.ICON_TEXT_FIT_HEIGHT, AbN.A02((1HU) obj4, obj4.A07(6)));
                        A0N6.setTree("image", GOp.A0G(A0N7, TraceFieldType.Uri, AbN.A0m((1HU) obj4, obj4.A03()), 1974585833));
                    }
                    int A089 = AbstractC2326GOr.A08(byteBuffer5, A036);
                    A0N6.setString(MsysOpenMessagingAttachmentDeletionPluginPostmailbox.PLAYABLE_URL, (8 >= byteBuffer5.getShort(A089) || (s = byteBuffer5.getShort(A089 + 8)) == 0) ? null : A0B(byteBuffer5, s, A036));
                    tree5 = A0N6.getResult(2JX.class, 1758109738);
                } else {
                    tree5 = null;
                }
                A0N.setTree("media", tree5);
                int A075 = obj.A07(16);
                if (A075 == 0 || obj.A09(A075) <= 0) {
                    immutableList = null;
                } else {
                    ImmutableList.Builder A0h2 = 4YU.A0h();
                    for (int i3 = 0; i3 < A02(obj, 16); i3++) {
                        ?? obj5 = new Object();
                        int A076 = obj.A07(16);
                        if (A076 != 0) {
                            AbstractC2326GOr.A1L(obj, obj5, 1HU.A00((1HU) obj, A076, i3));
                            TreeBuilderJNI A0N8 = AbF.A0N(2tS.A00(), 6As.class, "ArticleContextActionLink", 1153377331);
                            A0N8.setString("integrity_context_identifier", AbstractC2327GOs.A0R(obj5));
                            A0N8.setString("integrity_context_title", AbN.A0m((1HU) obj5, obj5.A05()));
                            A0h2.m11011add((Object) GOp.A0G(A0N8, "integrity_context_extra_data", AbN.A0m((1HU) obj5, obj5.A03()), 1153377331));
                        }
                    }
                    immutableList = A0h2.build();
                }
                A0N.setTreeList("action_links", (Iterable) immutableList);
                A0h.m11011add((Object) A0N.getResult(GhC.class, -978801287));
            }
            i = i2 + 1;
        }
    }

    public static String A0A(1HU r301, int i) {
        int A07 = r301.A07(i);
        if (A07 != 0) {
            return r301.A0A(A07 + r301.A00);
        }
        return null;
    }

    public static String A0B(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i + i2;
        int i4 = i3 + byteBuffer.getInt(i3);
        if (byteBuffer.hasArray()) {
            return new String(byteBuffer.array(), byteBuffer.arrayOffset() + i4 + 4, byteBuffer.getInt(i4), 1IJ.A0A);
        }
        ByteBuffer order = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int i5 = order.getInt(i4);
        byte[] bArr = new byte[i5];
        order.position(i4 + 4);
        order.get(bArr);
        return new String(bArr, 0, i5, 1IJ.A0A);
    }

    public static String A0C(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i + i2;
        int i4 = i3 + byteBuffer.getInt(i3);
        if (byteBuffer.hasArray()) {
            return new String(byteBuffer.array(), byteBuffer.arrayOffset() + i4 + 4, byteBuffer.getInt(i4), 1IJ.A0A);
        }
        ByteBuffer order = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int i5 = order.getInt(i4);
        byte[] bArr = new byte[i5];
        order.position(i4 + 4);
        order.get(bArr);
        return new String(bArr, 0, i5, 1IJ.A0A);
    }

    public static String A0D(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i + i2;
        int i4 = i3 + byteBuffer.getInt(i3);
        if (byteBuffer.hasArray()) {
            return new String(byteBuffer.array(), byteBuffer.arrayOffset() + i4 + 4, byteBuffer.getInt(i4), 1IJ.A0A);
        }
        ByteBuffer order = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int i5 = order.getInt(i4);
        byte[] bArr = new byte[i5];
        order.position(i4 + 4);
        order.get(bArr);
        return new String(bArr, 0, i5, 1IJ.A0A);
    }

    public static void A0E(1HU r301, int i) {
        r301.A01.getInt(i + r301.A00);
    }

    public static void A0F(1HU r301, int i) {
        r301.A0A(i + r301.A00);
    }

    public static void A0G(1HU r301, ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4 = i + i2;
        int i5 = i4 + byteBuffer.getInt(i4) + 4 + (i3 * 4);
        r301.A00 = i5 + byteBuffer.getInt(i5);
        r301.A01 = byteBuffer;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v136 ??, still in use, count: 2, list:
          (r313v136 ??) from 0x31a8: PHI (r313v138 ??) = (r313v137 ??), (r313v136 ??) binds: [B:1232:0x31b7, B:706:0x31a3] A[DONT_GENERATE, DONT_INLINE]
          (r313v136 ?? I:X.1HU) from 0x31a5: INVOKE (r304v0 ?? I:X.1HU), (r313v136 ?? I:X.1HU), (r0v1169 ?? I:int) STATIC call: X.AbN.A1S(X.1HU, X.1HU, int):void A[Catch: Exception -> 0x4e23]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public com.facebook.messaging.model.messages.Message A0H(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v136 ??, still in use, count: 2, list:
          (r313v136 ??) from 0x31a8: PHI (r313v138 ??) = (r313v137 ??), (r313v136 ??) binds: [B:1232:0x31b7, B:706:0x31a3] A[DONT_GENERATE, DONT_INLINE]
          (r313v136 ?? I:X.1HU) from 0x31a5: INVOKE (r304v0 ?? I:X.1HU), (r313v136 ?? I:X.1HU), (r0v1169 ?? I:int) STATIC call: X.AbN.A1S(X.1HU, X.1HU, int):void A[Catch: Exception -> 0x4e23]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */
}
