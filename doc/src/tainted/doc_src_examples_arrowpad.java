/*   Ported from: doc.src.examples.arrowpad.qdoc
<snip>
//! [0]
        qApp->translate("ArrowPad", x)
//! [0]


//! [1]
        lrelease arrowpad.pro
//! [1]


//! [2]
        export LANG=fr
        setenv LANG fr
//! [2]


//! [3]
        set LANG=fr
//! [3]


</snip>
*/
import com.trolltech.qt.*;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.xml.*;
import com.trolltech.qt.network.*;
import com.trolltech.qt.sql.*;
import com.trolltech.qt.svg.*;


public class doc_src_examples_arrowpad {
    public static void main(String args[]) {
        QApplication.initialize(args);
//! [0]
        qApp.translate("ArrowPad", x)
//! [0]


//! [1]
        lrelease arrowpad.pro
//! [1]


//! [2]
        export LANG=fr
        setenv LANG fr
//! [2]


//! [3]
        set LANG=fr
//! [3]


    }
}