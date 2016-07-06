/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

/**
 * Class Frequency1CodeCls.The Frequency1Code atomic simple data
 * type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class Frequency1CodeCls extends biz.c24.io.api.data.GenericStringDataType {

    /**
     * Field instance.
     */
    protected static volatile Frequency1CodeCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected Frequency1CodeCls() {
    }

    /**
     * Gets the singleton instance of this type.
     * 
     * @return The type, or its supertype if present.
     */
    public static biz.c24.io.api.data.DataType getInstance() {
        if (!initialized)
        {
            synchronized (biz.c24.io.api.data.ComplexDataType.class)
            {
                if (instance == null)
                {
                    instance = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Frequency1CodeCls();
                    instance.init();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    /**
     * Called internally to initialize this type.
     */
    protected void init() {
        setName("Frequency1Code");
        setModel(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance());
        addValidator(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Frequency1CodeCls.Frequency1Code1Enum.getInstance());
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class Frequency1Code1Enum.The Frequency1Code enumeration.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     */
    public static class Frequency1Code1Enum extends biz.c24.io.api.data.DefaultEnumeration {

        /**
         * Field instance.
         */
        private static biz.c24.io.api.data.Enumeration instance;

        private Frequency1Code1Enum() {
            setName("Frequency1Code");
            addEntry("YEAR", "", null);
            addEntry("MNTH", "", null);
            addEntry("QURT", "", null);
            addEntry("MIAN", "", null);
            addEntry("WEEK", "", null);
            addEntry("DAIL", "", null);
            addEntry("ADHO", "", null);
            addEntry("INDA", "", null);
        }

        /**
         */
        public static biz.c24.io.api.data.Enumeration getInstance() {
            if (instance == null)
                instance = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Frequency1CodeCls.Frequency1Code1Enum();

            return instance;
        }

    }

}