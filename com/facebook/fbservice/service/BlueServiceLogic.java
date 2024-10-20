package com.facebook.fbservice.service;

import X.0FI;
import X.0fH;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Id;
import X.1Ig;
import X.1SY;
import X.1SZ;
import X.1Sd;
import X.1T7;
import X.1TE;
import X.1Tu;
import X.29B;
import X.3jA;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C00i;
import X.C15h;
import X.GEW;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.service.ICompletionHandler;
import com.facebook.fbservice.service.messenger.PhoneConfirmationQueue;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.inject.FbInjector;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: BlueServiceLogic.class */
public final class BlueServiceLogic extends Binder implements IBlueService {
    public final C00i A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final Object A0A;
    public final Map A0B;
    public final C15h A0C;
    public final C00i A0D;
    public final C00i A0E;
    public final AtomicLong A0F;

    public BlueServiceLogic() {
        this(0);
        int A03 = 0FI.A03(27692500);
        this.A0A = new Object();
        this.A0B = new HashMap();
        this.A0F = new AtomicLong(System.currentTimeMillis());
        this.A00 = new 1BQ(67199);
        this.A01 = new 1BQ(66185);
        this.A02 = new 1BQ(16616);
        this.A03 = new 1BQ(16569);
        this.A04 = new 1BQ(16568);
        this.A0D = FbInjector.A00;
        this.A05 = new 1BQ(16511);
        this.A0E = new 1BQ(66186);
        this.A06 = new 1BQ(16471);
        this.A0C = new 3jA(this, 2);
        this.A08 = new 1BQ(16672);
        this.A09 = new 1BV(16428);
        this.A07 = new 1BQ(16566);
        0FI.A09(-2143042533, A03);
    }

    public BlueServiceLogic(int i) {
        int A03 = 0FI.A03(-2051041382);
        attachInterface(this, "com.facebook.fbservice.service.IBlueService");
        0FI.A09(471917658, A03);
    }

    private 1Id A00(String str) {
        1Id r308;
        int i;
        boolean containsKey;
        int A03 = 0FI.A03(478954944);
        synchronized (this.A0A) {
            try {
                Iterator it = this.A0B.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        r308 = null;
                        i = -861204456;
                        break;
                    }
                    r308 = (1Id) it.next();
                    synchronized (r308) {
                        containsKey = r308.A0L.containsKey(str);
                    }
                    if (containsKey) {
                        i = -1985250451;
                        break;
                    }
                }
            } catch (Throwable th) {
                0FI.A09(1916309603, A03);
                throw th;
            }
        }
        0FI.A09(i, A03);
        return r308;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.fbservice.service.IBlueService, java.lang.Object, com.facebook.fbservice.service.IBlueService$Stub$Proxy] */
    public static IBlueService A01(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.fbservice.service.IBlueService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof IBlueService)) {
            return (IBlueService) queryLocalInterface;
        }
        ?? obj = new Object();
        int A03 = 0FI.A03(-1738721481);
        obj.A00 = iBinder;
        0FI.A09(1833494170, A03);
        return obj;
    }

    public void A02() {
        int A03 = 0FI.A03(-1380048221);
        synchronized (this.A0A) {
            try {
                Map map = this.A0B;
                ArrayList A0t = AnonymousClass001.A0t(map.size());
                Iterator A1A = 1BK.A1A(map);
                while (A1A.hasNext()) {
                    1Id r0 = (1Id) A1A.next();
                    Class cls = r0.A0J;
                    if (cls == AuthQueue.class || cls == PhoneConfirmationQueue.class) {
                        A0t.add(r0);
                    } else {
                        r0.A01();
                    }
                }
                map.clear();
                Iterator it = A0t.iterator();
                while (it.hasNext()) {
                    1Id r02 = (1Id) it.next();
                    map.put(r02.A0J, r02);
                }
            } catch (Throwable th) {
                0FI.A09(152854671, A03);
                throw th;
            }
        }
        0FI.A09(1086130645, A03);
    }

    public void A03() {
        int A03 = 0FI.A03(-1321099297);
        synchronized (this.A0A) {
            try {
                Map map = this.A0B;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((1Id) it.next()).A01();
                }
                map.clear();
            } catch (Throwable th) {
                0FI.A09(-1562674796, A03);
                throw th;
            }
        }
        0FI.A09(222267995, A03);
    }

    public boolean A04(Class cls) {
        boolean z;
        int A03 = 0FI.A03(-2042555849);
        synchronized (this.A0A) {
            z = true;
            try {
                1Id r0 = (1Id) this.A0B.get(cls);
                if (r0 != null) {
                    synchronized (r0) {
                        z = r0.A0K.isEmpty();
                    }
                }
            } catch (Throwable th) {
                0FI.A09(-1128460416, A03);
                throw th;
            }
        }
        0FI.A09(-1057277552, A03);
        return z;
    }

    @Override // com.facebook.fbservice.service.IBlueService
    public boolean AE1(String str) {
        boolean z;
        int i;
        int A03 = 0FI.A03(-1239422518);
        1Id A00 = A00(str);
        if (A00 != null) {
            synchronized (A00) {
                1Sd r0 = (1Sd) A00.A0L.get(str);
                if (r0 != null && r0.A03 == null) {
                    1SY r02 = r0.A08;
                    if (A00.A0K.remove(r02)) {
                        1T7 CZt = A00.A09.CZt((ViewerContext) r02.A01.getParcelable("overridden_viewer_context"));
                        try {
                            1Id.A00(r0, A00, OperationResult.A01(29B.A04));
                            CZt.close();
                            r0.A06 = true;
                            z = true;
                        } finally {
                        }
                    } else {
                        1Sd r03 = A00.A00;
                        if (r03 != null && r03.A08 == r02) {
                            r03.A06 = true;
                            1Ig r04 = A00.A0G;
                            FbUserSession fbUserSession = r02.A02;
                            BlueServiceLogic blueServiceLogic = r04.A00;
                            String str2 = r04.A01;
                            0FI.A09(-1246057459, 0FI.A03(-2117313723));
                            GEW gew = (1Tu) 1TE.A00(fbUserSession, blueServiceLogic, str2);
                            if (gew instanceof GEW) {
                                A00.A01.getClass();
                                r0.A06 = true;
                                z = gew.AEF(str);
                            }
                        }
                    }
                }
                z = false;
            }
            i = -1176189505;
        } else {
            z = false;
            i = 656472101;
        }
        0FI.A09(i, A03);
        return z;
    }

    @Override // com.facebook.fbservice.service.IBlueService
    public boolean AEc(RequestPriority requestPriority, String str) {
        boolean z;
        int i;
        int A03 = 0FI.A03(-1712948283);
        1Id A00 = A00(str);
        if (A00 != null) {
            synchronized (A00) {
                1Sd r0 = (1Sd) A00.A0L.get(str);
                z = false;
                if (r0 != null) {
                    1SZ r02 = r0.A09;
                    Preconditions.checkNotNull(requestPriority, "Cannot change priority to null");
                    RequestPriority requestPriority2 = r02.A03;
                    r02.A03 = requestPriority;
                    0fH.A03(1SZ.class, r02.A01, requestPriority2, requestPriority, r02.A00, "Cannot change priority of request %s since ConnectionPrioritizerTrigger is not set. Queuing priority change from %s to %s. Overwriting pending priority change %s.");
                    r02.A00 = requestPriority;
                    z = true;
                }
            }
            i = -1601730552;
        } else {
            z = false;
            i = 130237197;
        }
        0FI.A09(i, A03);
        return z;
    }

    @Override // com.facebook.fbservice.service.IBlueService
    public boolean CcF(ICompletionHandler iCompletionHandler, String str) {
        boolean z;
        boolean z2;
        int i;
        boolean containsKey;
        int A03 = 0FI.A03(1981632494);
        synchronized (this.A0A) {
            try {
                Iterator it = this.A0B.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = null;
                        break;
                    }
                    z = (1Id) it.next();
                    synchronized (z) {
                        containsKey = z.A0L.containsKey(str);
                    }
                    if (containsKey) {
                        break;
                    }
                }
            } catch (Throwable th) {
                0FI.A09(1565686149, A03);
                throw th;
            }
        }
        if (z != null) {
            synchronized (z) {
                try {
                    1Sd r0 = (1Sd) z.A0L.get(str);
                    if (r0 != null) {
                        OperationResult operationResult = r0.A03;
                        if (operationResult == null) {
                            r0.A05.add(iCompletionHandler);
                            operationResult = null;
                        }
                        if (operationResult != null) {
                            try {
                                iCompletionHandler.CA5(operationResult);
                            } catch (RemoteException unused) {
                            }
                        }
                        z2 = true;
                        i = -98649723;
                    }
                } finally {
                    boolean z3 = z;
                }
            }
            0FI.A09(i, A03);
            return z;
        }
        z2 = false;
        i = -2023913905;
        0FI.A09(i, A03);
        return z;
    }

    @Override // com.facebook.fbservice.service.IBlueService
    public String D20(Bundle bundle, ViewerContext viewerContext, CallerContext callerContext, String str, boolean z) {
        int A03 = 0FI.A03(-928798782);
        String D21 = D21(bundle, viewerContext, callerContext, null, str, z, false);
        0FI.A09(-555646232, A03);
        return D21;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v21 ??, still in use, count: 9, list:
          (r315v21 ??) from 0x338b: PHI (r315v9 ??) = (r315v8 ??), (r315v21 ??) binds: [B:81:0x1bba, B:186:0x3383] A[DONT_GENERATE, DONT_INLINE]
          (r315v21 ?? I:X.1Id) from 0x329d: IGET (r0v1418 ?? I:java.util.concurrent.atomic.AtomicBoolean) = (r315v21 ?? I:X.1Id) A[Catch: RuntimeException -> 0x371e, all -> 0x37fe] X.1Id.A0N java.util.concurrent.atomic.AtomicBoolean
          (r315v21 ?? I:X.1Id) from 0x32c2: IGET (r0v1427 ?? I:java.lang.Class) = (r315v21 ?? I:X.1Id) A[Catch: RuntimeException -> 0x371e, all -> 0x37fe] X.1Id.A0J java.lang.Class
          (r315v21 ?? I:X.1Id) from 0x32d9: IGET (r0v1433 ?? I:X.1Ir) = (r315v21 ?? I:X.1Id) A[Catch: RuntimeException -> 0x371e, all -> 0x37fe] X.1Id.A0C X.1Ir
          (r315v21 ?? I:X.1Id) from 0x32e0: IGET (r0v1435 ?? I:X.1DW) = (r315v21 ?? I:X.1Id) A[Catch: RuntimeException -> 0x371e, all -> 0x37fe] X.1Id.A0D X.1DW
          (r315v21 ?? I:X.1Id) from 0x331b: IPUT (r0v1447 ?? I:java.util.concurrent.ScheduledExecutorService), (r315v21 ?? I:X.1Id) A[Catch: RuntimeException -> 0x371e, all -> 0x37fe] X.1Id.A01 java.util.concurrent.ScheduledExecutorService
          (r315v21 ?? I:X.1Id) from 0x3320: IGET (r0v1450 ?? I:X.1IX) = (r315v21 ?? I:X.1Id) A[Catch: RuntimeException -> 0x371e, all -> 0x37fe] X.1Id.A0H X.1IX
          (r315v21 ?? I:java.lang.Object) from 0x3349: INVOKE (r0v1461 ?? I:java.util.Set), (r315v21 ?? I:java.lang.Object) INTERFACE call: java.util.Set.add(java.lang.Object):boolean A[Catch: all -> 0x3357, MD:(E):boolean (c)]
          (r315v21 ?? I:java.lang.Object) from 0x3385: INVOKE (r0v748 ?? I:java.util.Map), (r1v146 ?? I:java.lang.Object), (r315v21 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: RuntimeException -> 0x371e, all -> 0x37fe, MD:(K, V):V (c)]
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
    @Override // com.facebook.fbservice.service.IBlueService
    public java.lang.String D21(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v21 ??, still in use, count: 9, list:
          (r315v21 ??) from 0x338b: PHI (r315v9 ??) = (r315v8 ??), (r315v21 ??) binds: [B:81:0x1bba, B:186:0x3383] A[DONT_GENERATE, DONT_INLINE]
          (r315v21 ?? I:X.1Id) from 0x329d: IGET (r0v1418 ?? I:java.util.concurrent.atomic.AtomicBoolean) = (r315v21 ?? I:X.1Id) A[Catch: RuntimeException -> 0x371e, all -> 0x37fe] X.1Id.A0N java.util.concurrent.atomic.AtomicBoolean
          (r315v21 ?? I:X.1Id) from 0x32c2: IGET (r0v1427 ?? I:java.lang.Class) = (r315v21 ?? I:X.1Id) A[Catch: RuntimeException -> 0x371e, all -> 0x37fe] X.1Id.A0J java.lang.Class
          (r315v21 ?? I:X.1Id) from 0x32d9: IGET (r0v1433 ?? I:X.1Ir) = (r315v21 ?? I:X.1Id) A[Catch: RuntimeException -> 0x371e, all -> 0x37fe] X.1Id.A0C X.1Ir
          (r315v21 ?? I:X.1Id) from 0x32e0: IGET (r0v1435 ?? I:X.1DW) = (r315v21 ?? I:X.1Id) A[Catch: RuntimeException -> 0x371e, all -> 0x37fe] X.1Id.A0D X.1DW
          (r315v21 ?? I:X.1Id) from 0x331b: IPUT (r0v1447 ?? I:java.util.concurrent.ScheduledExecutorService), (r315v21 ?? I:X.1Id) A[Catch: RuntimeException -> 0x371e, all -> 0x37fe] X.1Id.A01 java.util.concurrent.ScheduledExecutorService
          (r315v21 ?? I:X.1Id) from 0x3320: IGET (r0v1450 ?? I:X.1IX) = (r315v21 ?? I:X.1Id) A[Catch: RuntimeException -> 0x371e, all -> 0x37fe] X.1Id.A0H X.1IX
          (r315v21 ?? I:java.lang.Object) from 0x3349: INVOKE (r0v1461 ?? I:java.util.Set), (r315v21 ?? I:java.lang.Object) INTERFACE call: java.util.Set.add(java.lang.Object):boolean A[Catch: all -> 0x3357, MD:(E):boolean (c)]
          (r315v21 ?? I:java.lang.Object) from 0x3385: INVOKE (r0v748 ?? I:java.util.Map), (r1v146 ?? I:java.lang.Object), (r315v21 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: RuntimeException -> 0x371e, all -> 0x37fe, MD:(K, V):V (c)]
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

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(1612977669, 0FI.A03(347609561));
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        String D20;
        boolean AE1;
        int A03 = 0FI.A03(1004720701);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.fbservice.service.IBlueService");
                if (i == 1) {
                    String readString = parcel.readString();
                    D20 = D20((Bundle) AnonymousClass002.A0I(parcel, Bundle.CREATOR), (ViewerContext) AnonymousClass002.A0I(parcel, ViewerContext.CREATOR), (CallerContext) AnonymousClass002.A0I(parcel, CallerContext.CREATOR), readString, AnonymousClass001.A1N(parcel.readInt()));
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            AE1 = AE1(parcel.readString());
                        } else if (i == 4) {
                            AE1 = AEc((RequestPriority) AnonymousClass002.A0I(parcel, RequestPriority.CREATOR), parcel.readString());
                        } else if (i == 5) {
                            AE1 = CcF(ICompletionHandler.Stub.A00(parcel.readStrongBinder()), parcel.readString());
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(AE1 ? 1 : 0);
                        i3 = 1839622595;
                        0FI.A09(i3, A03);
                        return true;
                    }
                    String readString2 = parcel.readString();
                    Bundle bundle = (Bundle) AnonymousClass002.A0I(parcel, Bundle.CREATOR);
                    boolean A1N = AnonymousClass001.A1N(parcel.readInt());
                    boolean A1N2 = AnonymousClass001.A1N(parcel.readInt());
                    D20 = D21(bundle, (ViewerContext) AnonymousClass002.A0I(parcel, ViewerContext.CREATOR), (CallerContext) AnonymousClass002.A0I(parcel, CallerContext.CREATOR), ICompletionHandler.Stub.A00(parcel.readStrongBinder()), readString2, A1N, A1N2);
                }
                parcel2.writeNoException();
                parcel2.writeString(D20);
                i3 = 1839622595;
                0FI.A09(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString("com.facebook.fbservice.service.IBlueService");
                i3 = -1240768423;
                0FI.A09(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        0FI.A09(1275036587, A03);
        return onTransact;
    }
}
