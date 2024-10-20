package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.litho.ComponentHost;
import com.facebook.rendercore.RenderTreeNode;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.1rF, reason: invalid class name */
/* loaded from: 1rF.class */
public class C1rF {
    public 1sY A00;
    public 1sW A01;
    public 2AS A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final C00p A06 = new C00p(10);
    public final C1qv A07;
    public final 1JX A08;

    public C1rF(C1qv c1qv, 1JX r303) {
        this.A07 = c1qv;
        this.A08 = r303;
        Context context = c1qv.getContext();
        11T.A0A(context);
        this.A05 = context;
    }

    private void A00() {
        1sW r0 = this.A01;
        if (r0 != null) {
            r0.A03();
            List list = r0.A07;
            int size = list.size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    break;
                }
                1sX r02 = (1sX) list.get(i2);
                C1sS c1sS = r02.A01;
                if (c1sS instanceof 1sY) {
                    r02.A00();
                } else if (c1sS instanceof C1sk) {
                    C1sk.A03(r02);
                }
                i = i2 + 1;
            }
            r0.A02();
            r0.A03();
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                1sX r03 = (1sX) list.get(i3);
                C1sS c1sS2 = r03.A01;
                if (c1sS2 instanceof 1sY) {
                    1sY.A06(r03);
                    r03.A00();
                    ((C1sb) r03.A02).A00 = -1;
                } else if (c1sS2 instanceof C1sc) {
                    r03.A00();
                    C1se c1se = (C1se) r03.A02;
                    c1se.A00 = null;
                    c1se.A02 = null;
                    c1se.A01 = null;
                } else if (c1sS2 instanceof C1sk) {
                    C1sl c1sl = (C1sl) r03.A02;
                    c1sl.A05.setEmpty();
                    c1sl.A02 = null;
                } else if (c1sS2 instanceof 1sZ) {
                    r03.A00();
                    C1sj c1sj = (C1sj) r03.A02;
                    c1sj.A03.setEmpty();
                    c1sj.A05.clear();
                }
            }
            r0.A02();
            r0.A05.A00 = null;
            r0.A00 = null;
            list.clear();
            r0.A02 = false;
        }
    }

    public static final void A01(2JH r301, C1rF c1rF, RenderTreeNode renderTreeNode, 25G r304, Object obj) {
        1sW r0 = c1rF.A01;
        if (r0 != null) {
            Object obj2 = renderTreeNode.A07;
            1JX r02 = c1rF.A08;
            r0.A03();
            List list = r0.A07;
            int size = list.size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    break;
                }
                Object obj3 = list.get(i2);
                11T.A0I(obj3, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
                1sX r03 = (1sX) obj3;
                C1sS c1sS = r03.A01;
                if (c1sS instanceof 1sU) {
                    boolean BWo = r02.BWo();
                    if (BWo) {
                        r02.ABk(0Pz.A0W("Extension:onUnmountItem ", c1sS.A0A()));
                    }
                    ((1sU) c1sS).CSK(r304, r03, obj, obj2);
                    if (BWo) {
                        r02.AQF();
                    }
                }
                i = i2 + 1;
            }
            r0.A02();
        }
        r304.A0C(c1rF.A05, r301, c1rF.A08, obj, renderTreeNode.A07);
    }

    private final void A02(2JH r302, RenderTreeNode renderTreeNode, 25G r304, Object obj) {
        Integer A01 = 1LZ.A01("RenderCore.MountItem.Mount");
        if (A01 != null) {
            HashMap A0u = AnonymousClass001.A0u();
            A09(r304, A0u, r304.A0I());
            A0u.put("hashCode", 1BK.A0j(obj));
            A0u.put("bounds", renderTreeNode.A03);
            A0u.put("key", r304.A06());
            int intValue = A01.intValue();
            2AS r0 = this.A02;
            if (r0 == null) {
                throw 1BK.A0h();
            }
            1LZ.A04("RenderCore.MountItem.Mount", String.valueOf(r0.A00), A0u, intValue);
        }
        Context context = this.A05;
        Object obj2 = renderTreeNode.A07;
        1JX r02 = this.A08;
        r304.A0B(context, r302, r02, obj, obj2);
        1sW r03 = this.A01;
        if (r03 != null) {
            11T.A0F(obj, 1);
            r03.A03();
            List list = r03.A07;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj3 = list.get(i);
                11T.A0I(obj3, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
                1sX r04 = (1sX) obj3;
                C1sS c1sS = r04.A01;
                if (c1sS instanceof 1sU) {
                    boolean BWo = r02.BWo();
                    if (BWo) {
                        r02.ABk(0Pz.A0W("Extension:onMountItem ", c1sS.A0A()));
                    }
                    ((1sU) c1sS).C7h(r304, r04, obj, obj2);
                    if (BWo) {
                        r02.AQF();
                    }
                }
            }
            r03.A02();
        }
        if (A01 != null) {
            1BL.A1D(A01);
        }
    }

    private final void A03(2JG r302) {
        25G r0 = r302.A01.A06;
        11T.A0I(r0, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
        Object obj = r302.A04;
        Object obj2 = r302.A01.A07;
        Context context = this.A05;
        2JH r02 = r302.A03;
        1JX r03 = this.A08;
        r0.A09(context, r02, r03, obj, obj2);
        1sW r04 = this.A01;
        if (r04 != null) {
            r04.A03();
            List list = r04.A07;
            int size = list.size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    break;
                }
                Object obj3 = list.get(i2);
                11T.A0I(obj3, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
                1sX r05 = (1sX) obj3;
                C1sS c1sS = r05.A01;
                if (c1sS instanceof 1sU) {
                    boolean BWo = r03.BWo();
                    if (BWo) {
                        r03.ABk(0Pz.A0W("Extension:onBindItem ", c1sS.A0A()));
                    }
                    ((1sU) c1sS).BlX(r0, r05, obj, obj2);
                    if (BWo) {
                        r03.AQF();
                    }
                }
                i = i2 + 1;
            }
            r04.A02();
        }
        r302.A02 = true;
    }

    public static final void A04(2JG r301, C1rF c1rF) {
        25G r0 = r301.A01.A06;
        11T.A0I(r0, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
        Object obj = r301.A04;
        Object obj2 = r301.A01.A07;
        1sW r02 = c1rF.A01;
        if (r02 != null) {
            1JX r03 = c1rF.A08;
            r02.A03();
            List list = r02.A07;
            int size = list.size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    break;
                }
                Object obj3 = list.get(i2);
                11T.A0I(obj3, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
                1sX r04 = (1sX) obj3;
                C1sS c1sS = r04.A01;
                if (c1sS instanceof 1sU) {
                    boolean BWo = r03.BWo();
                    if (BWo) {
                        r03.ABk(0Pz.A0W("Extension:onUnbindItem ", c1sS.A0A()));
                    }
                    ((1sU) c1sS).CSB(r0, r04, obj, obj2);
                    if (BWo) {
                        r03.AQF();
                    }
                }
                i = i2 + 1;
            }
            r02.A02();
        }
        r0.A0A(c1rF.A05, r301.A03, c1rF.A08, obj, obj2);
        r301.A02 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01d5, code lost:
    
        if (((android.view.View) r0).isLayoutRequested() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A05(X.2JG r302, com.facebook.rendercore.RenderTreeNode r303) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1rF.A05(X.2JG, com.facebook.rendercore.RenderTreeNode):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(C1rF c1rF, long j) {
        boolean z;
        C00p c00p = c1rF.A06;
        2JG r0 = (2JG) c00p.A05(j);
        if (r0 != null) {
            1JX r02 = c1rF.A08;
            boolean BWo = r02.BWo();
            RenderTreeNode renderTreeNode = r0.A01;
            25G r03 = renderTreeNode.A06;
            11T.A0I(r03, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
            Object obj = r0.A04;
            if (c1rF.A00 != null) {
                1sW r04 = c1rF.A01;
                if (r04 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                1sX r05 = r04.A00;
                if (r05 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                z = ((C1sb) r05.A02).A0A.containsKey(r0.A01.A06);
            } else {
                z = false;
            }
            Integer A01 = 1LZ.A01("RenderCore.RenderUnit.Unmounted");
            if (A01 != null) {
                HashMap A0u = AnonymousClass001.A0u();
                A09(r03, A0u, j);
                A0u.put("bounds", renderTreeNode.A03);
                A0u.put("rootHostHashCode", 1BK.A0j(c1rF.A07));
                A0u.put("key", r03.A06());
                int intValue = A01.intValue();
                2AS r06 = c1rF.A02;
                if (r06 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                1LZ.A04("RenderCore.RenderUnit.Unmounted", String.valueOf(r06.A00), A0u, intValue);
            }
            if (BWo) {
                r02.ABk(0Pz.A0W("UnmountItem: ", r03.A07()));
            }
            C01i c01i = renderTreeNode.A08;
            if (((List) c01i.getValue()).size() > 0) {
                int size = ((List) c01i.getValue()).size() - 1;
                while (true) {
                    int i = size;
                    if (-1 >= i) {
                        break;
                    }
                    A06(c1rF, ((RenderTreeNode) ((List) c01i.getValue()).get(i)).A06.A0I());
                    size = i - 1;
                }
                if (!z) {
                    11T.A0I(obj, "null cannot be cast to non-null type com.facebook.rendercore.Host");
                    if (((C1qv) obj).A0Q() > 0) {
                        throw AnonymousClass001.A0N("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                    }
                }
            }
            long A0I = r03.A0I();
            if (A0I == 0) {
                2JG r07 = (2JG) c00p.A05(0L);
                if (r07 != null) {
                    if (r07.A02) {
                        A04(r07, c1rF);
                    }
                    c00p.A0A(0L);
                    2AS r08 = c1rF.A02;
                    if (r08 == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    RenderTreeNode renderTreeNode2 = r08.A03;
                    25G r09 = renderTreeNode2.A06;
                    11T.A0I(r09, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
                    A01(r07.A03, c1rF, renderTreeNode2, r09, r07.A04);
                }
            } else {
                c00p.A0A(A0I);
                C1qv c1qv = r0.A00;
                if (!z) {
                    if (BWo) {
                        r02.ABk(0Pz.A0W("UnmountItem:remove: ", r03.A07()));
                    }
                    if (c1qv != 0) {
                        c1qv.A0S(r0);
                    }
                    if (BWo) {
                        r02.AQF();
                    }
                    if (r0.A02) {
                        if (BWo) {
                            r02.ABk(0Pz.A0W("UnmountItem:unbind: ", r03.A07()));
                        }
                        A04(r0, c1rF);
                        if (BWo) {
                            r02.AQF();
                        }
                    }
                    if (obj instanceof View) {
                        ((View) obj).setPadding(0, 0, 0, 0);
                    }
                    if (BWo) {
                        r02.ABk(0Pz.A0W("UnmountItem:unmount: ", r03.A07()));
                    }
                    A01(r0.A03, c1rF, renderTreeNode, r03, obj);
                    if (BWo) {
                        r02.AQF();
                    }
                    r0.A00(c1rF.A05);
                } else {
                    if (c1rF.A00 == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    1sW r010 = c1rF.A01;
                    if (r010 == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    1sX r011 = r010.A00;
                    if (r011 == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    C1sb c1sb = (C1sb) r011.A02;
                    C29k c29k = (C29k) c1sb.A0A.get(r0.A01.A06);
                    C26n c26n = (C26n) c1sb.A09.get(c29k.A04);
                    if (c26n != null) {
                        if (c26n.A01[c29k.A00] != null && c1qv != 0) {
                            ComponentHost componentHost = (ComponentHost) ((C1qz) c1qv);
                            0AE r012 = componentHost.A0M;
                            int A02 = r012.A02(r012.A03(r0));
                            if (obj instanceof Drawable) {
                                AbstractC03443y2.A00(componentHost.A0L, componentHost.A03, A02);
                            } else if (obj instanceof View) {
                                AbstractC03443y2.A00(componentHost.A0N, componentHost.A05, A02);
                                componentHost.A0H = true;
                                ComponentHost.A0P(componentHost, r0, A02);
                            }
                            AbstractC03443y2.A00(r012, componentHost.A04, A02);
                            ComponentHost.A0N(componentHost);
                            ArrayList arrayList = componentHost.A0D;
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                componentHost.A0D = arrayList;
                            }
                            arrayList.add(r0);
                            r0.A00 = null;
                            c1sb.A08.put(r0, c1qv);
                        }
                    }
                }
            }
            if (BWo) {
                r02.AQF();
            }
            if (A01 != null) {
                1BL.A1D(A01);
            }
        }
    }

    private final void A07(RenderTreeNode renderTreeNode) {
        C1qv c1qv = this.A07;
        2JG r0 = new 2JG(renderTreeNode, c1qv);
        25G r02 = renderTreeNode.A06;
        11T.A0I(r02, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
        A02(r0.A03, renderTreeNode, r02, c1qv);
        this.A06.A0C(0L, r0);
        A03(r0);
    }

    public static final void A08(25G r301, 25G r302, Object obj) {
        if (obj instanceof C1qv) {
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("\n            Trying to mount a RenderTreeNode, its parent should be a Host, but was '");
        A0k.append(AnonymousClass001.A0X(obj));
        A0k.append("'.\n            Parent RenderUnit: id=");
        A0k.append(r302.A0I());
        A0k.append("; poolKey='");
        A0k.append(r302.A0J().B3t());
        A0k.append("'.\n            Child RenderUnit: id=");
        A0k.append(r301.A0I());
        A0k.append("; poolKey='");
        A0k.append(r301.A0J().B3t());
        throw AnonymousClass001.A0T(0Cc.A0j(AnonymousClass001.A0d("'.\n            ", A0k)));
    }

    public static void A09(25G r301, AbstractMap abstractMap, long j) {
        abstractMap.put("renderUnitId", Long.valueOf(j));
        abstractMap.put("description", r301.A07());
    }

    public static final boolean A0A(RenderTreeNode renderTreeNode, 1JX r302, Object obj, boolean z) {
        Rect rect = renderTreeNode.A03;
        return 2JL.A00(renderTreeNode.A04, r302, obj, rect.left, rect.top, rect.right, rect.bottom, z);
    }

    public 2JG A0B(int i) {
        2AS r0 = this.A02;
        if (r0 != null) {
            return (2JG) this.A06.A05(r0.A05[i].A06.A0I());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0079, code lost:
    
        if ((r302 instanceof X.1sZ) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1sX A0C(X.C1sS r302) {
        /*
            r301 = this;
            r0 = r301
            X.1sW r0 = r0.A01
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1d
            r0 = r301
            X.1JX r0 = r0.A08
            r304 = r0
            X.1sW r0 = new X.1sW
            r303 = r0
            r0 = r303
            r1 = r301
            r2 = r304
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r303
            r0.A01 = r1
        L1d:
            r0 = r302
            java.lang.Object r0 = r0.A0B()
            r304 = r0
            X.1sX r0 = new X.1sX
            r305 = r0
            r0 = r305
            r1 = r303
            r2 = r302
            r3 = r304
            r0.<init>(r1, r2, r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>"
            r304 = r0
            r0 = r305
            r1 = r304
            X.11T.A0I(r0, r1)
            r0 = r302
            boolean r0 = r0 instanceof X.1sY
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L61
            r0 = r303
            X.1rF r0 = r0.A05
            r307 = r0
            r0 = r302
            r304 = r0
            r0 = r302
            X.1sY r0 = (X.1sY) r0
            r304 = r0
            r0 = r304
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r307
            r1 = r304
            r0.A00 = r1
            r0 = r303
            r1 = r305
            r0.A00 = r1
        L61:
            r0 = r303
            boolean r0 = r0.A02
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L7c
            r0 = r302
            boolean r0 = r0 instanceof X.1sZ
            r308 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
            r0 = r308
            if (r0 == 0) goto L7f
        L7c:
            r0 = 1
            r306 = r0
        L7f:
            r0 = r303
            r1 = r306
            r0.A02 = r1
            r0 = r303
            java.util.List r0 = r0.A07
            r1 = r305
            boolean r0 = r0.add(r1)
            r0 = r305
            java.lang.String r1 = "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<State of com.facebook.rendercore.MountState.registerMountExtension>"
            X.11T.A0I(r0, r1)
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1rF.A0C(X.1sS):X.1sX");
    }

    public void A0D() {
        2AS r0 = this.A02;
        if (r0 != null) {
            1JX r02 = this.A08;
            boolean BWo = r02.BWo();
            if (BWo) {
                r02.ABk("MountState.bind");
            }
            for (RenderTreeNode renderTreeNode : r0.A05) {
                2JG r03 = (2JG) this.A06.A05(renderTreeNode.A06.A0I());
                if (r03 != null && !r03.A02) {
                    Object obj = r03.A04;
                    A03(r03);
                    if ((obj instanceof View) && !(obj instanceof C1qv) && ((View) obj).isLayoutRequested()) {
                        A0A(r03.A01, r02, obj, true);
                    }
                }
            }
            if (BWo) {
                r02.AQF();
            }
        }
    }

    public void A0E() {
        2AS r0 = this.A02;
        if (r0 != null) {
            1JX r02 = this.A08;
            boolean BWo = r02.BWo();
            if (BWo) {
                r02.ABk("MountState.unbind");
                r02.ABk("MountState.unbindAllContent");
            }
            for (RenderTreeNode renderTreeNode : r0.A05) {
                2JG r03 = (2JG) this.A06.A05(renderTreeNode.A06.A0I());
                if (r03 != null && r03.A02) {
                    A04(r03, this);
                }
            }
            if (BWo) {
                r02.AQF();
                r02.ABk("MountState.unbindExtensions");
            }
            1sW r04 = this.A01;
            if (r04 != null) {
                r04.A03();
                List list = r04.A07;
                int size = list.size();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= size) {
                        break;
                    }
                    1sX r05 = (1sX) list.get(i2);
                    C1sS c1sS = r05.A01;
                    if (c1sS instanceof 1sY) {
                        r05.A00();
                    } else if (c1sS instanceof C1sk) {
                        C1sk.A03(r05);
                    }
                    i = i2 + 1;
                }
                r04.A02();
            }
            if (BWo) {
                r02.AQF();
                r02.AQF();
            }
        }
    }

    public void A0F() {
        try {
            C1qv c1qv = this.A07;
            c1qv.A0V();
            if (this.A02 == null) {
                A00();
            } else {
                1JX r0 = this.A08;
                boolean BWo = r0.BWo();
                if (BWo) {
                    r0.ABk("MountState.unmountAllItems");
                }
                A06(this, 0L);
                A00();
                if (BWo) {
                    r0.AQF();
                }
                this.A03 = true;
                this.A02 = null;
            }
            c1qv.A0W();
        } catch (Throwable th) {
            this.A07.A0W();
            throw th;
        }
    }

    public void A0G(2JG r302, 25G r303, 25G r304, Object obj, Object obj2, Object obj3) {
        Context context = this.A05;
        1sW r0 = this.A01;
        r303.A08(context, r302.A03, r0, r304, this.A08, obj, obj2, obj3, r302.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x077a, code lost:
    
        if (((X.C1sb) r0.A02).A0A.containsKey(r0.A01.A06) != false) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x04bd, code lost:
    
        if ((r0 instanceof X.1sZ) != false) goto L156;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x066b A[Catch: Exception -> 0x0c5d, all -> 0x0ca3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0c5d, blocks: (B:37:0x01ac, B:41:0x01bc, B:43:0x01c3, B:45:0x01c9, B:48:0x01d5, B:90:0x031e, B:93:0x032a, B:96:0x0336, B:97:0x033d, B:104:0x0354, B:105:0x035d, B:108:0x036d, B:113:0x0385, B:114:0x038e, B:115:0x0395, B:117:0x039e, B:118:0x03a7, B:119:0x03ae, B:121:0x03b7, B:127:0x03cc, B:129:0x04df, B:131:0x04e5, B:132:0x04e9, B:133:0x04f1, B:135:0x04fc, B:140:0x0512, B:144:0x052a, B:146:0x0533, B:148:0x053b, B:150:0x0548, B:153:0x0551, B:158:0x066b, B:160:0x0677, B:162:0x0680, B:167:0x068f, B:171:0x06a2, B:173:0x06ab, B:174:0x06b0, B:179:0x06c1, B:180:0x06c6, B:181:0x06cd, B:182:0x06d4, B:184:0x06de, B:186:0x06e9, B:187:0x06f0, B:188:0x06f7, B:189:0x06fe, B:190:0x0705, B:192:0x070e, B:193:0x0715, B:196:0x0721, B:199:0x0732, B:202:0x073e, B:205:0x074a, B:206:0x0751, B:207:0x0758, B:208:0x075f, B:209:0x0766, B:211:0x076f, B:215:0x0c53, B:217:0x0c5c, B:219:0x0848, B:222:0x0785, B:224:0x078e, B:227:0x0798, B:230:0x07a4, B:231:0x07ab, B:233:0x07b4, B:234:0x07bb, B:237:0x07c7, B:239:0x07d5, B:241:0x07dc, B:246:0x07f9, B:247:0x0800, B:248:0x0807, B:252:0x081b, B:255:0x0852, B:257:0x085c, B:258:0x0823, B:259:0x082a, B:260:0x0831, B:262:0x083a, B:268:0x086b, B:270:0x0873, B:272:0x0885, B:273:0x088c, B:274:0x0893, B:277:0x089f, B:279:0x08a8, B:283:0x08b3, B:286:0x08c9, B:288:0x08d0, B:289:0x08d5, B:294:0x08e6, B:295:0x08eb, B:299:0x08f9, B:301:0x08ff, B:304:0x0909, B:306:0x0914, B:307:0x091b, B:311:0x0931, B:312:0x093a, B:313:0x0941, B:316:0x0954, B:318:0x095d, B:320:0x096c, B:322:0x0973, B:324:0x097e, B:328:0x098e, B:330:0x0995, B:331:0x099a, B:332:0x09a1, B:334:0x09aa, B:335:0x09b1, B:338:0x09bd, B:342:0x09d8, B:343:0x09df, B:345:0x09ec, B:346:0x09f3, B:352:0x0a08, B:355:0x0a10, B:356:0x0a17, B:357:0x0a1e, B:359:0x0a27, B:363:0x0a36, B:367:0x0a46, B:369:0x0a4f, B:371:0x0a5b, B:373:0x0a64, B:376:0x0a6e, B:378:0x0a75, B:379:0x0a7a, B:384:0x0a92, B:385:0x0a9b, B:386:0x0aa2, B:388:0x0aab, B:391:0x0ab9, B:394:0x0ac3, B:396:0x0acb, B:398:0x0ad1, B:404:0x0ae6, B:407:0x0af8, B:409:0x0b02, B:449:0x08bf, B:450:0x0c3c, B:453:0x0571, B:454:0x0576, B:456:0x0581, B:458:0x0589, B:460:0x0596, B:463:0x05a4, B:464:0x05ad, B:465:0x05b4, B:466:0x05bb, B:467:0x05c2, B:468:0x05c9, B:472:0x05d5, B:474:0x05de, B:476:0x05ed, B:478:0x05f4, B:479:0x05f9, B:483:0x060d, B:489:0x061e, B:490:0x0625, B:491:0x062c, B:493:0x0642, B:495:0x0650, B:496:0x0657, B:498:0x065e, B:502:0x03d2, B:505:0x03dc, B:508:0x03e8, B:509:0x03ef, B:511:0x03f8, B:513:0x03ff, B:514:0x0404, B:516:0x040d, B:517:0x0414, B:520:0x0422, B:521:0x042b, B:522:0x0432, B:523:0x0439, B:524:0x0440, B:528:0x044c, B:529:0x0453, B:531:0x045c, B:533:0x0466, B:536:0x0477, B:538:0x0482, B:540:0x0491, B:541:0x0497, B:542:0x049e, B:544:0x04a4, B:550:0x04c5, B:551:0x04cc, B:558:0x04d8, B:560:0x0c49), top: B:36:0x01ac, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0866 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x089f A[Catch: Exception -> 0x0c5d, all -> 0x0ca3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0c5d, blocks: (B:37:0x01ac, B:41:0x01bc, B:43:0x01c3, B:45:0x01c9, B:48:0x01d5, B:90:0x031e, B:93:0x032a, B:96:0x0336, B:97:0x033d, B:104:0x0354, B:105:0x035d, B:108:0x036d, B:113:0x0385, B:114:0x038e, B:115:0x0395, B:117:0x039e, B:118:0x03a7, B:119:0x03ae, B:121:0x03b7, B:127:0x03cc, B:129:0x04df, B:131:0x04e5, B:132:0x04e9, B:133:0x04f1, B:135:0x04fc, B:140:0x0512, B:144:0x052a, B:146:0x0533, B:148:0x053b, B:150:0x0548, B:153:0x0551, B:158:0x066b, B:160:0x0677, B:162:0x0680, B:167:0x068f, B:171:0x06a2, B:173:0x06ab, B:174:0x06b0, B:179:0x06c1, B:180:0x06c6, B:181:0x06cd, B:182:0x06d4, B:184:0x06de, B:186:0x06e9, B:187:0x06f0, B:188:0x06f7, B:189:0x06fe, B:190:0x0705, B:192:0x070e, B:193:0x0715, B:196:0x0721, B:199:0x0732, B:202:0x073e, B:205:0x074a, B:206:0x0751, B:207:0x0758, B:208:0x075f, B:209:0x0766, B:211:0x076f, B:215:0x0c53, B:217:0x0c5c, B:219:0x0848, B:222:0x0785, B:224:0x078e, B:227:0x0798, B:230:0x07a4, B:231:0x07ab, B:233:0x07b4, B:234:0x07bb, B:237:0x07c7, B:239:0x07d5, B:241:0x07dc, B:246:0x07f9, B:247:0x0800, B:248:0x0807, B:252:0x081b, B:255:0x0852, B:257:0x085c, B:258:0x0823, B:259:0x082a, B:260:0x0831, B:262:0x083a, B:268:0x086b, B:270:0x0873, B:272:0x0885, B:273:0x088c, B:274:0x0893, B:277:0x089f, B:279:0x08a8, B:283:0x08b3, B:286:0x08c9, B:288:0x08d0, B:289:0x08d5, B:294:0x08e6, B:295:0x08eb, B:299:0x08f9, B:301:0x08ff, B:304:0x0909, B:306:0x0914, B:307:0x091b, B:311:0x0931, B:312:0x093a, B:313:0x0941, B:316:0x0954, B:318:0x095d, B:320:0x096c, B:322:0x0973, B:324:0x097e, B:328:0x098e, B:330:0x0995, B:331:0x099a, B:332:0x09a1, B:334:0x09aa, B:335:0x09b1, B:338:0x09bd, B:342:0x09d8, B:343:0x09df, B:345:0x09ec, B:346:0x09f3, B:352:0x0a08, B:355:0x0a10, B:356:0x0a17, B:357:0x0a1e, B:359:0x0a27, B:363:0x0a36, B:367:0x0a46, B:369:0x0a4f, B:371:0x0a5b, B:373:0x0a64, B:376:0x0a6e, B:378:0x0a75, B:379:0x0a7a, B:384:0x0a92, B:385:0x0a9b, B:386:0x0aa2, B:388:0x0aab, B:391:0x0ab9, B:394:0x0ac3, B:396:0x0acb, B:398:0x0ad1, B:404:0x0ae6, B:407:0x0af8, B:409:0x0b02, B:449:0x08bf, B:450:0x0c3c, B:453:0x0571, B:454:0x0576, B:456:0x0581, B:458:0x0589, B:460:0x0596, B:463:0x05a4, B:464:0x05ad, B:465:0x05b4, B:466:0x05bb, B:467:0x05c2, B:468:0x05c9, B:472:0x05d5, B:474:0x05de, B:476:0x05ed, B:478:0x05f4, B:479:0x05f9, B:483:0x060d, B:489:0x061e, B:490:0x0625, B:491:0x062c, B:493:0x0642, B:495:0x0650, B:496:0x0657, B:498:0x065e, B:502:0x03d2, B:505:0x03dc, B:508:0x03e8, B:509:0x03ef, B:511:0x03f8, B:513:0x03ff, B:514:0x0404, B:516:0x040d, B:517:0x0414, B:520:0x0422, B:521:0x042b, B:522:0x0432, B:523:0x0439, B:524:0x0440, B:528:0x044c, B:529:0x0453, B:531:0x045c, B:533:0x0466, B:536:0x0477, B:538:0x0482, B:540:0x0491, B:541:0x0497, B:542:0x049e, B:544:0x04a4, B:550:0x04c5, B:551:0x04cc, B:558:0x04d8, B:560:0x0c49), top: B:36:0x01ac, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0a2f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0c3c A[Catch: Exception -> 0x0c5d, all -> 0x0ca3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0c5d, blocks: (B:37:0x01ac, B:41:0x01bc, B:43:0x01c3, B:45:0x01c9, B:48:0x01d5, B:90:0x031e, B:93:0x032a, B:96:0x0336, B:97:0x033d, B:104:0x0354, B:105:0x035d, B:108:0x036d, B:113:0x0385, B:114:0x038e, B:115:0x0395, B:117:0x039e, B:118:0x03a7, B:119:0x03ae, B:121:0x03b7, B:127:0x03cc, B:129:0x04df, B:131:0x04e5, B:132:0x04e9, B:133:0x04f1, B:135:0x04fc, B:140:0x0512, B:144:0x052a, B:146:0x0533, B:148:0x053b, B:150:0x0548, B:153:0x0551, B:158:0x066b, B:160:0x0677, B:162:0x0680, B:167:0x068f, B:171:0x06a2, B:173:0x06ab, B:174:0x06b0, B:179:0x06c1, B:180:0x06c6, B:181:0x06cd, B:182:0x06d4, B:184:0x06de, B:186:0x06e9, B:187:0x06f0, B:188:0x06f7, B:189:0x06fe, B:190:0x0705, B:192:0x070e, B:193:0x0715, B:196:0x0721, B:199:0x0732, B:202:0x073e, B:205:0x074a, B:206:0x0751, B:207:0x0758, B:208:0x075f, B:209:0x0766, B:211:0x076f, B:215:0x0c53, B:217:0x0c5c, B:219:0x0848, B:222:0x0785, B:224:0x078e, B:227:0x0798, B:230:0x07a4, B:231:0x07ab, B:233:0x07b4, B:234:0x07bb, B:237:0x07c7, B:239:0x07d5, B:241:0x07dc, B:246:0x07f9, B:247:0x0800, B:248:0x0807, B:252:0x081b, B:255:0x0852, B:257:0x085c, B:258:0x0823, B:259:0x082a, B:260:0x0831, B:262:0x083a, B:268:0x086b, B:270:0x0873, B:272:0x0885, B:273:0x088c, B:274:0x0893, B:277:0x089f, B:279:0x08a8, B:283:0x08b3, B:286:0x08c9, B:288:0x08d0, B:289:0x08d5, B:294:0x08e6, B:295:0x08eb, B:299:0x08f9, B:301:0x08ff, B:304:0x0909, B:306:0x0914, B:307:0x091b, B:311:0x0931, B:312:0x093a, B:313:0x0941, B:316:0x0954, B:318:0x095d, B:320:0x096c, B:322:0x0973, B:324:0x097e, B:328:0x098e, B:330:0x0995, B:331:0x099a, B:332:0x09a1, B:334:0x09aa, B:335:0x09b1, B:338:0x09bd, B:342:0x09d8, B:343:0x09df, B:345:0x09ec, B:346:0x09f3, B:352:0x0a08, B:355:0x0a10, B:356:0x0a17, B:357:0x0a1e, B:359:0x0a27, B:363:0x0a36, B:367:0x0a46, B:369:0x0a4f, B:371:0x0a5b, B:373:0x0a64, B:376:0x0a6e, B:378:0x0a75, B:379:0x0a7a, B:384:0x0a92, B:385:0x0a9b, B:386:0x0aa2, B:388:0x0aab, B:391:0x0ab9, B:394:0x0ac3, B:396:0x0acb, B:398:0x0ad1, B:404:0x0ae6, B:407:0x0af8, B:409:0x0b02, B:449:0x08bf, B:450:0x0c3c, B:453:0x0571, B:454:0x0576, B:456:0x0581, B:458:0x0589, B:460:0x0596, B:463:0x05a4, B:464:0x05ad, B:465:0x05b4, B:466:0x05bb, B:467:0x05c2, B:468:0x05c9, B:472:0x05d5, B:474:0x05de, B:476:0x05ed, B:478:0x05f4, B:479:0x05f9, B:483:0x060d, B:489:0x061e, B:490:0x0625, B:491:0x062c, B:493:0x0642, B:495:0x0650, B:496:0x0657, B:498:0x065e, B:502:0x03d2, B:505:0x03dc, B:508:0x03e8, B:509:0x03ef, B:511:0x03f8, B:513:0x03ff, B:514:0x0404, B:516:0x040d, B:517:0x0414, B:520:0x0422, B:521:0x042b, B:522:0x0432, B:523:0x0439, B:524:0x0440, B:528:0x044c, B:529:0x0453, B:531:0x045c, B:533:0x0466, B:536:0x0477, B:538:0x0482, B:540:0x0491, B:541:0x0497, B:542:0x049e, B:544:0x04a4, B:550:0x04c5, B:551:0x04cc, B:558:0x04d8, B:560:0x0c49), top: B:36:0x01ac, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x05a4 A[Catch: Exception -> 0x0c5d, all -> 0x0ca3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0c5d, blocks: (B:37:0x01ac, B:41:0x01bc, B:43:0x01c3, B:45:0x01c9, B:48:0x01d5, B:90:0x031e, B:93:0x032a, B:96:0x0336, B:97:0x033d, B:104:0x0354, B:105:0x035d, B:108:0x036d, B:113:0x0385, B:114:0x038e, B:115:0x0395, B:117:0x039e, B:118:0x03a7, B:119:0x03ae, B:121:0x03b7, B:127:0x03cc, B:129:0x04df, B:131:0x04e5, B:132:0x04e9, B:133:0x04f1, B:135:0x04fc, B:140:0x0512, B:144:0x052a, B:146:0x0533, B:148:0x053b, B:150:0x0548, B:153:0x0551, B:158:0x066b, B:160:0x0677, B:162:0x0680, B:167:0x068f, B:171:0x06a2, B:173:0x06ab, B:174:0x06b0, B:179:0x06c1, B:180:0x06c6, B:181:0x06cd, B:182:0x06d4, B:184:0x06de, B:186:0x06e9, B:187:0x06f0, B:188:0x06f7, B:189:0x06fe, B:190:0x0705, B:192:0x070e, B:193:0x0715, B:196:0x0721, B:199:0x0732, B:202:0x073e, B:205:0x074a, B:206:0x0751, B:207:0x0758, B:208:0x075f, B:209:0x0766, B:211:0x076f, B:215:0x0c53, B:217:0x0c5c, B:219:0x0848, B:222:0x0785, B:224:0x078e, B:227:0x0798, B:230:0x07a4, B:231:0x07ab, B:233:0x07b4, B:234:0x07bb, B:237:0x07c7, B:239:0x07d5, B:241:0x07dc, B:246:0x07f9, B:247:0x0800, B:248:0x0807, B:252:0x081b, B:255:0x0852, B:257:0x085c, B:258:0x0823, B:259:0x082a, B:260:0x0831, B:262:0x083a, B:268:0x086b, B:270:0x0873, B:272:0x0885, B:273:0x088c, B:274:0x0893, B:277:0x089f, B:279:0x08a8, B:283:0x08b3, B:286:0x08c9, B:288:0x08d0, B:289:0x08d5, B:294:0x08e6, B:295:0x08eb, B:299:0x08f9, B:301:0x08ff, B:304:0x0909, B:306:0x0914, B:307:0x091b, B:311:0x0931, B:312:0x093a, B:313:0x0941, B:316:0x0954, B:318:0x095d, B:320:0x096c, B:322:0x0973, B:324:0x097e, B:328:0x098e, B:330:0x0995, B:331:0x099a, B:332:0x09a1, B:334:0x09aa, B:335:0x09b1, B:338:0x09bd, B:342:0x09d8, B:343:0x09df, B:345:0x09ec, B:346:0x09f3, B:352:0x0a08, B:355:0x0a10, B:356:0x0a17, B:357:0x0a1e, B:359:0x0a27, B:363:0x0a36, B:367:0x0a46, B:369:0x0a4f, B:371:0x0a5b, B:373:0x0a64, B:376:0x0a6e, B:378:0x0a75, B:379:0x0a7a, B:384:0x0a92, B:385:0x0a9b, B:386:0x0aa2, B:388:0x0aab, B:391:0x0ab9, B:394:0x0ac3, B:396:0x0acb, B:398:0x0ad1, B:404:0x0ae6, B:407:0x0af8, B:409:0x0b02, B:449:0x08bf, B:450:0x0c3c, B:453:0x0571, B:454:0x0576, B:456:0x0581, B:458:0x0589, B:460:0x0596, B:463:0x05a4, B:464:0x05ad, B:465:0x05b4, B:466:0x05bb, B:467:0x05c2, B:468:0x05c9, B:472:0x05d5, B:474:0x05de, B:476:0x05ed, B:478:0x05f4, B:479:0x05f9, B:483:0x060d, B:489:0x061e, B:490:0x0625, B:491:0x062c, B:493:0x0642, B:495:0x0650, B:496:0x0657, B:498:0x065e, B:502:0x03d2, B:505:0x03dc, B:508:0x03e8, B:509:0x03ef, B:511:0x03f8, B:513:0x03ff, B:514:0x0404, B:516:0x040d, B:517:0x0414, B:520:0x0422, B:521:0x042b, B:522:0x0432, B:523:0x0439, B:524:0x0440, B:528:0x044c, B:529:0x0453, B:531:0x045c, B:533:0x0466, B:536:0x0477, B:538:0x0482, B:540:0x0491, B:541:0x0497, B:542:0x049e, B:544:0x04a4, B:550:0x04c5, B:551:0x04cc, B:558:0x04d8, B:560:0x0c49), top: B:36:0x01ac, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0c44  */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v364, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v722, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v785, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r302v0, types: [X.2AS, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0H(X.2AS r302) {
        /*
            Method dump skipped, instructions count: 3595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1rF.A0H(X.2AS):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v261, types: [X.0ty] */
    /* JADX WARN: Type inference failed for: r0v313, types: [X.0ty] */
    public void A0I(RenderTreeNode renderTreeNode) {
        1JX r324;
        boolean BWo;
        25G r327;
        C00p c00p;
        Object A05;
        11T.A0F(renderTreeNode, 0);
        25G r0 = renderTreeNode.A06;
        long A0I = r0.A0I();
        if (A0I == 0) {
            A07(renderTreeNode);
            return;
        }
        Set set = 1LZ.A00;
        if (set.isEmpty()) {
            r324 = this.A08;
            BWo = r324.BWo();
            if (BWo) {
                r324.ABk(0Pz.A0W("MountItem: ", r0.A07()));
            }
            RenderTreeNode renderTreeNode2 = renderTreeNode.A05;
            if (renderTreeNode2 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            r327 = renderTreeNode2.A06;
            11T.A0I(r0, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
            if (BWo) {
                r324.ABk(0Pz.A0W("MountItem:mount-parent ", r327.A07()));
            }
            long A0I2 = r327.A0I();
            c00p = this.A06;
            if (c00p.A05(A0I2) == null) {
                A0I(renderTreeNode2);
            }
            if (BWo) {
                r324.AQF();
            }
            A05 = c00p.A05(r327.A0I());
            if (A05 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
        } else {
            ArrayList arrayList = null;
            for (Object obj : set) {
                String[] strArr = ((1LV) obj).A00;
                if (02L.A0C("RenderCore.RenderUnit.Mounted", strArr) || 02L.A0C("*", strArr)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(obj);
                }
            }
            if (arrayList == null) {
                arrayList = C0ty.A00;
            }
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = null;
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof Jv1) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2 == null) {
                    arrayList2 = C0ty.A00;
                }
                11T.A0I(arrayList2, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.rendercore.debug.TraceListener<kotlin.Any?>>");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("renderUnitId", Long.valueOf(A0I));
                linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r0.A07());
                linkedHashMap.put("bounds", renderTreeNode.A03);
                linkedHashMap.put("rootHostHashCode", Integer.valueOf(this.A07.hashCode()));
                linkedHashMap.put("key", r0.A06());
                ArrayList arrayList3 = new ArrayList(C1A3.A1D(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((Jv1) it.next()).A03("RenderCore.RenderUnit.Mounted"));
                }
                long currentTimeMillis = System.currentTimeMillis();
                long nanoTime = System.nanoTime();
                1JX r02 = this.A08;
                boolean BWo2 = r02.BWo();
                if (BWo2) {
                    r02.ABk(0Pz.A0W("MountItem: ", r0.A07()));
                }
                RenderTreeNode renderTreeNode3 = renderTreeNode.A05;
                if (renderTreeNode3 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                25G r03 = renderTreeNode3.A06;
                if (BWo2) {
                    r02.ABk(0Pz.A0W("MountItem:mount-parent ", r03.A07()));
                }
                long A0I3 = r03.A0I();
                C00p c00p2 = this.A06;
                if (c00p2.A05(A0I3) == null) {
                    A0I(renderTreeNode3);
                }
                if (BWo2) {
                    r02.AQF();
                }
                Object A052 = c00p2.A05(r03.A0I());
                if (A052 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                Object obj3 = ((2JG) A052).A04;
                A08(r0, r03, obj3);
                11T.A0I(obj3, "null cannot be cast to non-null type com.facebook.rendercore.Host");
                C1qv c1qv = (C1qv) obj3;
                if (BWo2) {
                    r02.ABk(0Pz.A0W("MountItem:acquire-content ", r0.A07()));
                }
                Object A01 = 2zJ.A01(this.A05, r0.A0J());
                if (BWo2) {
                    r02.AQF();
                }
                1sW r04 = this.A01;
                if (r04 != null) {
                    r04.A03();
                }
                if (BWo2) {
                    r02.ABk(0Pz.A0W("MountItem:mount ", r0.A07()));
                }
                2JG r05 = new 2JG(renderTreeNode, A01);
                A02(r05.A03, renderTreeNode, r0, A01);
                c00p2.A0C(r0.A0I(), r05);
                c1qv.A0X(r05, renderTreeNode.A02);
                if (BWo2) {
                    r02.AQF();
                    r02.ABk(0Pz.A0W("MountItem:bind ", r0.A07()));
                }
                A03(r05);
                if (BWo2) {
                    r02.AQF();
                    r02.ABk(0Pz.A0W("MountItem:applyBounds ", r0.A07()));
                }
                Object obj4 = r05.A04;
                boolean A0A = A0A(renderTreeNode, r02, obj4, true);
                if (BWo2) {
                    r02.AQF();
                    r02.ABk(0Pz.A0W("MountItem:after ", r0.A07()));
                }
                1sW r06 = this.A01;
                if (r06 != null) {
                    r06.A05(renderTreeNode, r02, obj4, A0A);
                }
                1sW r07 = this.A01;
                if (r07 != null) {
                    r07.A02();
                }
                if (BWo2) {
                    r02.AQF();
                    r02.AQF();
                }
                long nanoTime2 = System.nanoTime();
                2AS r08 = this.A02;
                if (r08 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                JSk jSk = new JSk("RenderCore.RenderUnit.Mounted", String.valueOf(r08.A00), linkedHashMap, currentTimeMillis, nanoTime2 - nanoTime);
                int i = 0;
                for (Object obj5 : arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C0s8.A18();
                        throw 0Q8.createAndThrow();
                    }
                    ((Jv1) obj5).A04(jSk, arrayList3.get(i));
                    i = i2;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((1LV) it2.next()).A02(jSk);
                }
                return;
            }
            r324 = this.A08;
            BWo = r324.BWo();
            if (BWo) {
                r324.ABk(0Pz.A0W("MountItem: ", r0.A07()));
            }
            RenderTreeNode renderTreeNode4 = renderTreeNode.A05;
            if (renderTreeNode4 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            r327 = renderTreeNode4.A06;
            11T.A0I(r0, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
            if (BWo) {
                r324.ABk(0Pz.A0W("MountItem:mount-parent ", r327.A07()));
            }
            long A0I4 = r327.A0I();
            c00p = this.A06;
            if (c00p.A05(A0I4) == null) {
                A0I(renderTreeNode4);
            }
            if (BWo) {
                r324.AQF();
            }
            A05 = c00p.A05(r327.A0I());
            if (A05 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
        }
        Object obj6 = ((2JG) A05).A04;
        A08(r0, r327, obj6);
        11T.A0I(obj6, "null cannot be cast to non-null type com.facebook.rendercore.Host");
        C1qv c1qv2 = (C1qv) obj6;
        if (BWo) {
            r324.ABk(0Pz.A0W("MountItem:acquire-content ", r0.A07()));
        }
        Object A012 = 2zJ.A01(this.A05, r0.A0J());
        if (BWo) {
            r324.AQF();
        }
        1sW r09 = this.A01;
        if (r09 != null) {
            r09.A03();
        }
        if (BWo) {
            r324.ABk(0Pz.A0W("MountItem:mount ", r0.A07()));
        }
        2JG r010 = new 2JG(renderTreeNode, A012);
        A02(r010.A03, renderTreeNode, r0, A012);
        c00p.A0C(r0.A0I(), r010);
        c1qv2.A0X(r010, renderTreeNode.A02);
        if (BWo) {
            r324.AQF();
            r324.ABk(0Pz.A0W("MountItem:bind ", r0.A07()));
        }
        A03(r010);
        if (BWo) {
            r324.AQF();
            StringBuilder sb = new StringBuilder();
            sb.append("MountItem:applyBounds ");
            sb.append(r0.A07());
            r324.ABk(sb.toString());
        }
        Object obj7 = r010.A04;
        boolean A0A2 = A0A(renderTreeNode, r324, obj7, true);
        if (BWo) {
            r324.AQF();
            r324.ABk(0Pz.A0W("MountItem:after ", r0.A07()));
        }
        1sW r011 = this.A01;
        if (r011 != null) {
            r011.A05(renderTreeNode, r324, obj7, A0A2);
        }
        1sW r012 = this.A01;
        if (r012 != null) {
            r012.A02();
        }
        if (BWo) {
            r324.AQF();
            r324.AQF();
        }
    }

    public boolean A0J(25G r302, 25G r303, Object obj, Object obj2) {
        if (r302 != r303) {
            return true;
        }
        if (obj == obj2) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !((!(obj instanceof 1Ip) || !(obj2 instanceof 1Ip)) ? C28q.A03(obj, obj2) : C28q.A01((1Ip) obj, (1Ip) obj2));
    }
}
