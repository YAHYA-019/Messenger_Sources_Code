package X;

import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeBuilderJNI;

/* renamed from: X.4Ed, reason: invalid class name */
/* loaded from: 4Ed.class */
public final class C4Ed extends 2JY implements C23u {
    public C4Ed(int i, int[] iArr) {
        super(i, iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C4Ed A00(C4Ed c4Ed) {
        TreeBuilderJNI treeBuilderJNI;
        Tree result;
        if (c4Ed == 0) {
            return null;
        }
        if (c4Ed.isValidGraphServicesJNIModel()) {
            result = c4Ed.reinterpret(C4Ed.class, 1530798005);
        } else {
            if (!(c4Ed instanceof Tree) || !((Tree) c4Ed).isValidGraphServicesJNIModel() || (treeBuilderJNI = (TreeBuilderJNI) 2tS.A00().newTreeBuilder(MRk.A00(11), 6As.class, 1530798005, (Tree) c4Ed)) == null) {
                return null;
            }
            result = treeBuilderJNI.getResult(C4Ed.class, 1530798005);
        }
        return (C4Ed) result;
    }
}
