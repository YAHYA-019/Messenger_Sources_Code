package X;

import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeBuilderJNI;

/* loaded from: Dkw.class */
public final class Dkw extends 2JY implements C23u {
    public Dkw(int i, int[] iArr) {
        super(i, iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Dkw A00(Dkw dkw) {
        TreeBuilderJNI treeBuilderJNI;
        Tree result;
        if (dkw.isValidGraphServicesJNIModel()) {
            result = dkw.reinterpret(Dkw.class, -493292361);
        } else {
            if (!(dkw instanceof Tree) || !((Tree) dkw).isValidGraphServicesJNIModel() || (treeBuilderJNI = (TreeBuilderJNI) 2tS.A00().newTreeBuilder("NativeMask", 6As.class, -493292361, (Tree) dkw)) == null) {
                return null;
            }
            result = treeBuilderJNI.getResult(Dkw.class, -493292361);
        }
        return (Dkw) result;
    }
}
