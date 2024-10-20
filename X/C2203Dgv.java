package X;

import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeBuilderJNI;
import com.facebook.graphservice.tree.TreeJNI;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Dgv, reason: case insensitive filesystem */
/* loaded from: Dgv.class */
public final class C2203Dgv extends 2JY implements GMA {
    public C2203Dgv(int i, int[] iArr) {
        super(i, iArr);
    }

    public static C2203Dgv A00(GMA gma) {
        TreeBuilderJNI treeBuilderJNI;
        Tree result;
        if (gma instanceof TreeJNI) {
            TreeJNI treeJNI = (TreeJNI) gma;
            if (treeJNI.isValidGraphServicesJNIModel()) {
                result = treeJNI.reinterpret(C2203Dgv.class, 1342072150);
                return (C2203Dgv) result;
            }
        }
        if (gma == null || !(gma instanceof Tree)) {
            return null;
        }
        Tree tree = (Tree) gma;
        if (!tree.isValidGraphServicesJNIModel() || (treeBuilderJNI = (TreeBuilderJNI) 2tS.A00().newTreeBuilder(4YT.A00(781), 6As.class, 1342072150, tree)) == null) {
            return null;
        }
        result = treeBuilderJNI.getResult(C2203Dgv.class, 1342072150);
        return (C2203Dgv) result;
    }

    public ImmutableList B5l() {
        return A0c(-938283306, 2JX.class, -378253412);
    }
}
