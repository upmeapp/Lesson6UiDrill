package assaf.zfani.lesson6uidrill;

import android.text.InputFilter;
import android.text.Spanned;
import android.util.Log;

/**
 * Created by user on 10/23/2017.
 */

public class FilterSpecificWords implements InputFilter {
    public static String TAG= "FilterSpecificWords";
    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        Log.i(TAG,"Sources = "+source);
        Log.i(TAG,"Source Start = "+ start);
        Log.i(TAG,"Source Ends = "+ end);
        Log.i(TAG,"Destination = "+dest);
        Log.i(TAG,"Destination Start = "+ dstart);
        Log.i(TAG,"Destination Ends = "+ dend);
        return null;
    }
}
