/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

/**
 * Class InterestType1ChoiceCls.The InterestType1Choice complex
 * data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1Choic
 */
public class InterestType1ChoiceCls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile InterestType1ChoiceCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected InterestType1ChoiceCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1ChoiceCls();
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
        setName("InterestType1Choice");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1Choice.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("InterestType1Choice-SG1", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1ChoiceCls.InterestType1ChoiceSG1Cls.class, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance()));
        element.setGroup(true);
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class InterestType1ChoiceSG1Cls.The InterestType1Choice-SG1
     * complex data type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     * @see
     * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1Choice.InterestType1ChoiceSG1
     */
    public static class InterestType1ChoiceSG1Cls extends biz.c24.io.api.data.ComplexDataType {

        /**
         * Field instance.
         */
        protected static volatile iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1ChoiceCls.InterestType1ChoiceSG1Cls instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected InterestType1ChoiceSG1Cls() {
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
                        instance = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1ChoiceCls.InterestType1ChoiceSG1Cls();
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
            setName("InterestType1ChoiceSG1");
            setModel(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance());
            setOriginalName("InterestType1Choice-SG1");
            setDatabaseColumnName("InterestType1Choice-SG1");
            setLocal(true);
            setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1Choice.InterestType1ChoiceSG1.class);
            setElementGroup(true);
            setContentModel(biz.c24.io.api.data.ContentModelEnum.CHOICE);
            biz.c24.io.api.data.Element element = null;
            addElementDecl(element = new biz.c24.io.api.data.Element("Cd", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.InterestType1CodeCls.class, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance()));
            element.setIgnoredElement(false);
            addElementDecl(element = new biz.c24.io.api.data.Element("Prtry", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Max35TextCls.class, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance()));
            element.setIgnoredElement(false);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

}
