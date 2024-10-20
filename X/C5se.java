package X;

import android.app.Person;
import android.content.Context;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.5se, reason: invalid class name */
/* loaded from: 5se.class */
public abstract class C5se {
    public static Person A00(5Ud r301) {
        Person.Builder name = new Person.Builder().setName(r301.A01);
        IconCompat iconCompat = r301.A00;
        Icon icon = null;
        if (iconCompat != null) {
            icon = 4iX.A00((Context) null, iconCompat);
        }
        return name.setIcon(icon).setUri(r301.A03).setKey(r301.A02).setBot(r301.A04).setImportant(r301.A05).build();
    }

    public static 5Ud A01(Person person) {
        CharSequence name = person.getName();
        return new 5Ud(person.getIcon() != null ? 4iX.A01(person.getIcon()) : null, name, person.getKey(), person.getUri(), person.isBot(), person.isImportant());
    }
}
