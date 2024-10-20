package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.draggableview.DraggableViewContainer;
import com.facebook.rtc.views.omnigrid.GridItemSize;
import com.facebook.rtc.views.omnigrid.GridItemType;
import com.facebook.rtc.views.omnigrid.GridLayoutInputItem;
import com.facebook.rtc.views.omnigrid.OmniGridLayoutManager;
import com.facebook.rtc.views.omnigrid.OmniGridRecyclerView;
import java.util.Iterator;
import java.util.List;

/* loaded from: GV0.class */
public class GV0 extends FrameLayout implements JDL {
    public View.OnTouchListener A00;
    public View A01;
    public 8Lm A02;
    public HVS A03;
    public GXp A04;
    public GjZ A05;
    public GzD A06;
    public GV0 A07;
    public Hep A08;
    public GjX A09;
    public List A0A;
    public java.util.Map A0B;
    public boolean A0C;
    public GWg A0D;
    public boolean A0E;
    public final RecyclerView A0F;
    public final DraggableViewContainer A0G;
    public final OmniGridLayoutManager A0H;
    public final GWs A0I;

    public GV0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(2132542408, (ViewGroup) this, true);
        OmniGridLayoutManager omniGridLayoutManager = new OmniGridLayoutManager(context, new J8M(this, 4));
        omniGridLayoutManager.A0F.add(new Gz7(this));
        this.A0H = omniGridLayoutManager;
        2NI gWs = new GWs(omniGridLayoutManager);
        this.A0I = gWs;
        this.A02 = Hwo.A01;
        View findViewById = findViewById(2131366075);
        OmniGridRecyclerView omniGridRecyclerView = (OmniGridRecyclerView) findViewById;
        omniGridRecyclerView.A1D(omniGridLayoutManager);
        omniGridRecyclerView.A1A(gWs);
        omniGridRecyclerView.A1F(new GXC(this, 5));
        omniGridRecyclerView.A00 = new GestureDetector(context, (GestureDetector.OnGestureListener) new GTd(this));
        omniGridRecyclerView.A0T = true;
        11T.A0A(findViewById);
        this.A0F = (RecyclerView) findViewById;
        this.A0G = (DraggableViewContainer) findViewById(2131364173);
        this.A0A = C0ty.A00;
    }

    public static final int A00(float f, float f2, int i) {
        float f3 = i;
        float f4 = f3 - f;
        return (int) (f2 >= 1.0f ? f3 + (f4 * (f2 - 1.0f)) : f3 - (f4 * (1.0f - f2)));
    }

    public static final GridLayoutInputItem A01(C2621GjB c2621GjB, java.util.Map map) {
        11T.A0H(c2621GjB, map);
        long j = c2621GjB.A01;
        GridItemType gridItemType = c2621GjB.A02;
        GridItemSize gridItemSize = (GridItemSize) map.get(Long.valueOf(j));
        if (gridItemSize == null) {
            gridItemSize = new GridItemSize(-1, -1);
        }
        return new GridLayoutInputItem(j, gridItemType, gridItemSize, AnonymousClass001.A1W(c2621GjB.A03, 0S2.A00), 0, null);
    }

    private final Long A02() {
        Long l;
        Object obj;
        Iterator A1G = GOn.A1G(this.A02.A05);
        while (true) {
            l = null;
            if (!A1G.hasNext()) {
                obj = null;
                break;
            }
            obj = A1G.next();
            if (((C2621GjB) obj).A02 == GridItemType.SELF_VIEW) {
                break;
            }
        }
        C2621GjB c2621GjB = (C2621GjB) obj;
        if (c2621GjB != null) {
            l = Long.valueOf(c2621GjB.A01);
        }
        return l;
    }

    public static final void A03(GV0 gv0, int i) {
        int i2;
        int i3;
        C00j.A05("OmniGridView.updateRoundedCornerForLayoutPosition", 290118795);
        try {
            GXp A0j = gv0.A0F.A0j(i, false);
            if (A0j instanceof GXp) {
                GXp gXp = A0j;
                if (gXp != null) {
                    C2632Gji c2632Gji = gv0.A0H.A07;
                    Integer num = c2632Gji.A08;
                    if (num != null) {
                        i3 = num.intValue();
                    } else {
                        Hep hep = gv0.A08;
                        if (hep == null) {
                            11T.A0L("gridViewParameters");
                            throw 0Q8.createAndThrow();
                        }
                        i3 = hep.A01;
                    }
                    Integer num2 = C2632Gji.A02(c2632Gji, i).A04;
                    if (i3 <= 0 || num2 == 0S2.A0C) {
                        gXp.A0A(0S2.A00);
                    } else {
                        Integer num3 = 0S2.A00;
                        Integer num4 = (num2 != num3 || ((Integer) gv0.A02.A03) == null) ? 0S2.A01 : num3;
                        Integer num5 = (Integer) gv0.A02.A03;
                        gXp.A0B(num4, num3, i3, num5 != null ? num5.intValue() : -1);
                    }
                    i2 = 268091002;
                    C00j.A01(i2);
                }
            }
            i2 = -442241196;
            C00j.A01(i2);
        } catch (Throwable th) {
            C00j.A01(-328056445);
            throw th;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r328v9 ??, still in use, count: 5, list:
          (r328v9 ??) from 0x0653: PHI (r328v8 ??) = (r328v7 ??), (r328v7 ??), (r328v9 ??), (r328v10 ??) binds: [B:192:0x04d9, B:210:0x0537, B:253:0x05e5, B:251:0x064e] A[DONT_GENERATE, DONT_INLINE]
          (r328v9 ?? I:X.GjK) from 0x05fb: IGET (r0v447 ?? I:int) = (r328v9 ?? I:X.GjK) A[Catch: all -> 0x079b] X.GjK.A01 int
          (r328v9 ?? I:X.GjK) from 0x060d: IGET (r0v451 ?? I:int) = (r328v9 ?? I:X.GjK) A[Catch: all -> 0x079b] X.GjK.A02 int
          (r328v9 ?? I:X.GjK) from 0x061f: IGET (r0v455 ?? I:int) = (r328v9 ?? I:X.GjK) A[Catch: all -> 0x079b] X.GjK.A03 int
          (r328v9 ?? I:X.GjK) from 0x0631: IGET (r0v459 ?? I:int) = (r328v9 ?? I:X.GjK) A[Catch: all -> 0x079b] X.GjK.A00 int
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
    public static final void A04(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r328v9 ??, still in use, count: 5, list:
          (r328v9 ??) from 0x0653: PHI (r328v8 ??) = (r328v7 ??), (r328v7 ??), (r328v9 ??), (r328v10 ??) binds: [B:192:0x04d9, B:210:0x0537, B:253:0x05e5, B:251:0x064e] A[DONT_GENERATE, DONT_INLINE]
          (r328v9 ?? I:X.GjK) from 0x05fb: IGET (r0v447 ?? I:int) = (r328v9 ?? I:X.GjK) A[Catch: all -> 0x079b] X.GjK.A01 int
          (r328v9 ?? I:X.GjK) from 0x060d: IGET (r0v451 ?? I:int) = (r328v9 ?? I:X.GjK) A[Catch: all -> 0x079b] X.GjK.A02 int
          (r328v9 ?? I:X.GjK) from 0x061f: IGET (r0v455 ?? I:int) = (r328v9 ?? I:X.GjK) A[Catch: all -> 0x079b] X.GjK.A03 int
          (r328v9 ?? I:X.GjK) from 0x0631: IGET (r0v459 ?? I:int) = (r328v9 ?? I:X.GjK) A[Catch: all -> 0x079b] X.GjK.A00 int
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r301v0 ??
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

    private final void A05(boolean z) {
        int i;
        C00j.A05("OmniGridView.hideFloatingSelfView", -1385067191);
        try {
            0fH.A0l("OmniGridView", "Hiding floating self view");
            GXp gXp = this.A04;
            if (gXp == null) {
                i = -274077905;
            } else {
                View view = this.A01;
                if (view == null) {
                    throw 1BK.A0h();
                }
                View view2 = gXp.A0I;
                11T.A09(view2);
                if (!11T.A0O(view.getParent(), view2)) {
                    view.setElevation(30.0f);
                    gXp.A0A(0S2.A0C);
                    RecyclerView recyclerView = this.A0F;
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    int[] iArr2 = new int[2];
                    recyclerView.getLocationInWindow(iArr2);
                    int i2 = iArr[0] - iArr2[0];
                    int i3 = iArr[1] - iArr2[1];
                    C2626GjK c2626GjK = new C2626GjK(i2, i3, view.getWidth() + i2, view.getHeight() + i3);
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                    }
                    if (view2 instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) view2;
                        if (viewGroup2 != null) {
                            viewGroup2.addView(view);
                        }
                    }
                    0fH.A0l("OmniGridView", AnonymousClass001.A0Z(c2626GjK, "Moving floating self view to grid from frame = ", AnonymousClass001.A0k()));
                    Long A02 = A02();
                    if (A02 != null) {
                        long longValue = A02.longValue();
                        if (z) {
                            OmniGridLayoutManager omniGridLayoutManager = this.A0H;
                            DqJ dqJ = Hwo.A00;
                            StringBuilder A0k = AnonymousClass001.A0k();
                            A0k.append("Setting previous frame: ");
                            A0k.append(c2626GjK);
                            A0k.append(" for ");
                            0fH.A0l("OmniGridLayoutManager", AnonymousClass001.A0h(A0k, longValue));
                            (omniGridLayoutManager.A0D ? omniGridLayoutManager.A0B : omniGridLayoutManager.A0A).put(A02, 1BK.A1G(c2626GjK, dqJ));
                            omniGridLayoutManager.A0e();
                            ((2XA) omniGridLayoutManager).A0F = true;
                        }
                    }
                }
                Integer num = 0S2.A00;
                if (gXp.A00 != num) {
                    gXp.A00 = num;
                    ((Gz6) gXp).A01.Ctq(1);
                }
                i = 1302275379;
            }
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(-1865935441);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a7, code lost:
    
        if (r307 == null) goto L136;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0220 A[Catch: all -> 0x043f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x043f, blocks: (B:3:0x0015, B:6:0x0020, B:8:0x0028, B:11:0x0033, B:14:0x0043, B:16:0x004b, B:17:0x0051, B:19:0x0057, B:20:0x005c, B:21:0x0063, B:22:0x0069, B:24:0x0072, B:28:0x008a, B:41:0x00dc, B:45:0x0281, B:47:0x043e, B:49:0x00e1, B:49:0x00e1, B:52:0x00ef, B:54:0x00f5, B:55:0x00fa, B:56:0x0101, B:57:0x0108, B:58:0x010f, B:59:0x0118, B:62:0x0126, B:63:0x012f, B:64:0x0136, B:65:0x013c, B:67:0x0145, B:69:0x014e, B:71:0x0157, B:73:0x015f, B:75:0x0174, B:77:0x017a, B:80:0x0184, B:81:0x018a, B:82:0x0191, B:84:0x019a, B:89:0x01b0, B:93:0x01c0, B:96:0x0205, B:97:0x020b, B:98:0x0212, B:101:0x0220, B:105:0x023c, B:117:0x028e, B:119:0x0295, B:122:0x029f, B:127:0x02c3, B:130:0x02ce, B:131:0x02d5, B:134:0x02e1, B:135:0x02e7, B:136:0x02ee, B:137:0x02f5, B:139:0x02fe, B:140:0x0307, B:143:0x0313, B:145:0x031a, B:148:0x0326, B:152:0x033c, B:154:0x0345, B:155:0x034a, B:158:0x0355, B:160:0x035b, B:161:0x0360, B:162:0x0366, B:163:0x036d, B:165:0x0376, B:167:0x037f, B:169:0x0388, B:173:0x03b7, B:174:0x03be, B:175:0x03c5, B:176:0x03cb, B:177:0x03d2, B:179:0x03db, B:182:0x03e7, B:183:0x03ee, B:184:0x03f5, B:185:0x03fb, B:186:0x0402, B:188:0x040b, B:196:0x0425, B:199:0x039f, B:201:0x03a6, B:204:0x03af, B:211:0x02b9, B:212:0x02aa, B:214:0x01c7, B:217:0x01d2, B:220:0x01dd, B:222:0x01e6, B:224:0x01ec, B:228:0x01f8, B:235:0x0435), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c3 A[Catch: all -> 0x043f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x043f, blocks: (B:3:0x0015, B:6:0x0020, B:8:0x0028, B:11:0x0033, B:14:0x0043, B:16:0x004b, B:17:0x0051, B:19:0x0057, B:20:0x005c, B:21:0x0063, B:22:0x0069, B:24:0x0072, B:28:0x008a, B:41:0x00dc, B:45:0x0281, B:47:0x043e, B:49:0x00e1, B:49:0x00e1, B:52:0x00ef, B:54:0x00f5, B:55:0x00fa, B:56:0x0101, B:57:0x0108, B:58:0x010f, B:59:0x0118, B:62:0x0126, B:63:0x012f, B:64:0x0136, B:65:0x013c, B:67:0x0145, B:69:0x014e, B:71:0x0157, B:73:0x015f, B:75:0x0174, B:77:0x017a, B:80:0x0184, B:81:0x018a, B:82:0x0191, B:84:0x019a, B:89:0x01b0, B:93:0x01c0, B:96:0x0205, B:97:0x020b, B:98:0x0212, B:101:0x0220, B:105:0x023c, B:117:0x028e, B:119:0x0295, B:122:0x029f, B:127:0x02c3, B:130:0x02ce, B:131:0x02d5, B:134:0x02e1, B:135:0x02e7, B:136:0x02ee, B:137:0x02f5, B:139:0x02fe, B:140:0x0307, B:143:0x0313, B:145:0x031a, B:148:0x0326, B:152:0x033c, B:154:0x0345, B:155:0x034a, B:158:0x0355, B:160:0x035b, B:161:0x0360, B:162:0x0366, B:163:0x036d, B:165:0x0376, B:167:0x037f, B:169:0x0388, B:173:0x03b7, B:174:0x03be, B:175:0x03c5, B:176:0x03cb, B:177:0x03d2, B:179:0x03db, B:182:0x03e7, B:183:0x03ee, B:184:0x03f5, B:185:0x03fb, B:186:0x0402, B:188:0x040b, B:196:0x0425, B:199:0x039f, B:201:0x03a6, B:204:0x03af, B:211:0x02b9, B:212:0x02aa, B:214:0x01c7, B:217:0x01d2, B:220:0x01dd, B:222:0x01e6, B:224:0x01ec, B:228:0x01f8, B:235:0x0435), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x037f A[Catch: all -> 0x043f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x043f, blocks: (B:3:0x0015, B:6:0x0020, B:8:0x0028, B:11:0x0033, B:14:0x0043, B:16:0x004b, B:17:0x0051, B:19:0x0057, B:20:0x005c, B:21:0x0063, B:22:0x0069, B:24:0x0072, B:28:0x008a, B:41:0x00dc, B:45:0x0281, B:47:0x043e, B:49:0x00e1, B:49:0x00e1, B:52:0x00ef, B:54:0x00f5, B:55:0x00fa, B:56:0x0101, B:57:0x0108, B:58:0x010f, B:59:0x0118, B:62:0x0126, B:63:0x012f, B:64:0x0136, B:65:0x013c, B:67:0x0145, B:69:0x014e, B:71:0x0157, B:73:0x015f, B:75:0x0174, B:77:0x017a, B:80:0x0184, B:81:0x018a, B:82:0x0191, B:84:0x019a, B:89:0x01b0, B:93:0x01c0, B:96:0x0205, B:97:0x020b, B:98:0x0212, B:101:0x0220, B:105:0x023c, B:117:0x028e, B:119:0x0295, B:122:0x029f, B:127:0x02c3, B:130:0x02ce, B:131:0x02d5, B:134:0x02e1, B:135:0x02e7, B:136:0x02ee, B:137:0x02f5, B:139:0x02fe, B:140:0x0307, B:143:0x0313, B:145:0x031a, B:148:0x0326, B:152:0x033c, B:154:0x0345, B:155:0x034a, B:158:0x0355, B:160:0x035b, B:161:0x0360, B:162:0x0366, B:163:0x036d, B:165:0x0376, B:167:0x037f, B:169:0x0388, B:173:0x03b7, B:174:0x03be, B:175:0x03c5, B:176:0x03cb, B:177:0x03d2, B:179:0x03db, B:182:0x03e7, B:183:0x03ee, B:184:0x03f5, B:185:0x03fb, B:186:0x0402, B:188:0x040b, B:196:0x0425, B:199:0x039f, B:201:0x03a6, B:204:0x03af, B:211:0x02b9, B:212:0x02aa, B:214:0x01c7, B:217:0x01d2, B:220:0x01dd, B:222:0x01e6, B:224:0x01ec, B:228:0x01f8, B:235:0x0435), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03e7 A[Catch: all -> 0x043f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x043f, blocks: (B:3:0x0015, B:6:0x0020, B:8:0x0028, B:11:0x0033, B:14:0x0043, B:16:0x004b, B:17:0x0051, B:19:0x0057, B:20:0x005c, B:21:0x0063, B:22:0x0069, B:24:0x0072, B:28:0x008a, B:41:0x00dc, B:45:0x0281, B:47:0x043e, B:49:0x00e1, B:49:0x00e1, B:52:0x00ef, B:54:0x00f5, B:55:0x00fa, B:56:0x0101, B:57:0x0108, B:58:0x010f, B:59:0x0118, B:62:0x0126, B:63:0x012f, B:64:0x0136, B:65:0x013c, B:67:0x0145, B:69:0x014e, B:71:0x0157, B:73:0x015f, B:75:0x0174, B:77:0x017a, B:80:0x0184, B:81:0x018a, B:82:0x0191, B:84:0x019a, B:89:0x01b0, B:93:0x01c0, B:96:0x0205, B:97:0x020b, B:98:0x0212, B:101:0x0220, B:105:0x023c, B:117:0x028e, B:119:0x0295, B:122:0x029f, B:127:0x02c3, B:130:0x02ce, B:131:0x02d5, B:134:0x02e1, B:135:0x02e7, B:136:0x02ee, B:137:0x02f5, B:139:0x02fe, B:140:0x0307, B:143:0x0313, B:145:0x031a, B:148:0x0326, B:152:0x033c, B:154:0x0345, B:155:0x034a, B:158:0x0355, B:160:0x035b, B:161:0x0360, B:162:0x0366, B:163:0x036d, B:165:0x0376, B:167:0x037f, B:169:0x0388, B:173:0x03b7, B:174:0x03be, B:175:0x03c5, B:176:0x03cb, B:177:0x03d2, B:179:0x03db, B:182:0x03e7, B:183:0x03ee, B:184:0x03f5, B:185:0x03fb, B:186:0x0402, B:188:0x040b, B:196:0x0425, B:199:0x039f, B:201:0x03a6, B:204:0x03af, B:211:0x02b9, B:212:0x02aa, B:214:0x01c7, B:217:0x01d2, B:220:0x01dd, B:222:0x01e6, B:224:0x01ec, B:228:0x01f8, B:235:0x0435), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A06(X.8Lm r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GV0.A06(X.8Lm, boolean):void");
    }

    public final void A07(java.util.Map map) {
        IllegalStateException A0N;
        Object obj;
        C00j.A05("OmniGridView.setItemDefinitions", 211195229);
        try {
            if (this.A0D == null) {
                Iterator A1A = 1BK.A1A(map);
                do {
                    obj = null;
                    if (!A1A.hasNext()) {
                        break;
                    } else {
                        obj = A1A.next();
                    }
                } while (!(((HFf) obj) instanceof GzD));
                GzD gzD = (HFf) obj;
                if (gzD != null) {
                    Resources A0E = GOn.A0E(this);
                    8Lm r0 = Hwo.A01;
                    this.A08 = new Hep(7zN.A01(A0E), A0E.getDimensionPixelSize(2132279311), A0E.getDimensionPixelSize(2132279310));
                    this.A0B = map;
                    this.A06 = gzD;
                    2Xd gWg = new GWg(map);
                    this.A0D = gWg;
                    gWg.A0B(true);
                    this.A0F.A16(gWg);
                    C00j.A01(1544903124);
                    return;
                }
                A0N = AnonymousClass001.A0N("Self Item definition is required but not found!");
            } else {
                A0N = AnonymousClass001.A0N("Do not call setItemDefinitions more than once!");
            }
            throw A0N;
        } catch (Throwable th) {
            C00j.A01(-1421047832);
            throw th;
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0H.A1h();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        11T.A0F(motionEvent, 0);
        View.OnTouchListener onTouchListener = this.A00;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(this, motionEvent);
        }
        return false;
    }
}
