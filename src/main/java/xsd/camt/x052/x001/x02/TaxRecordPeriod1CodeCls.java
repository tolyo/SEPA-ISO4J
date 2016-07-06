/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

/**
 * Class TaxRecordPeriod1CodeCls.The TaxRecordPeriod1Code atomic
 * simple data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class TaxRecordPeriod1CodeCls extends biz.c24.io.api.data.GenericStringDataType {

    /**
     * Field instance.
     */
    protected static volatile TaxRecordPeriod1CodeCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected TaxRecordPeriod1CodeCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordPeriod1CodeCls();
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
        setName("TaxRecordPeriod1Code");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance());
        addValidator(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordPeriod1CodeCls.TaxRecordPeriod1Code1Enum.getInstance());
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class TaxRecordPeriod1Code1Enum.The TaxRecordPeriod1Code
     * enumeration.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     */
    public static class TaxRecordPeriod1Code1Enum extends biz.c24.io.api.data.DefaultEnumeration {

        /**
         * Field instance.
         */
        private static biz.c24.io.api.data.Enumeration instance;

        private TaxRecordPeriod1Code1Enum() {
            setName("TaxRecordPeriod1Code");
            addEntry("MM01", "", null);
            addEntry("MM02", "", null);
            addEntry("MM03", "", null);
            addEntry("MM04", "", null);
            addEntry("MM05", "", null);
            addEntry("MM06", "", null);
            addEntry("MM07", "", null);
            addEntry("MM08", "", null);
            addEntry("MM09", "", null);
            addEntry("MM10", "", null);
            addEntry("MM11", "", null);
            addEntry("MM12", "", null);
            addEntry("QTR1", "", null);
            addEntry("QTR2", "", null);
            addEntry("QTR3", "", null);
            addEntry("QTR4", "", null);
            addEntry("HLF1", "", null);
            addEntry("HLF2", "", null);
        }

        /**
         */
        public static biz.c24.io.api.data.Enumeration getInstance() {
            if (instance == null)
                instance = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordPeriod1CodeCls.TaxRecordPeriod1Code1Enum();

            return instance;
        }

    }

}
