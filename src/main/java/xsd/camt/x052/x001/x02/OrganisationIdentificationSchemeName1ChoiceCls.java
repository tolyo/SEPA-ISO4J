/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

/**
 * Class OrganisationIdentificationSchemeName1ChoiceCls.The
 * OrganisationIdentificationSchemeName1Choice complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentificationSchemeName1Choice
 */
public class OrganisationIdentificationSchemeName1ChoiceCls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile OrganisationIdentificationSchemeName1ChoiceCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected OrganisationIdentificationSchemeName1ChoiceCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentificationSchemeName1ChoiceCls();
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
        setName("OrganisationIdentificationSchemeName1Choice");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentificationSchemeName1Choice.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("OrganisationIdentificationSchemeName1Choice-SG1", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentificationSchemeName1ChoiceCls.OrganisationIdentificationSchemeName1ChoiceSG1Cls.class, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance()));
        element.setGroup(true);
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class OrganisationIdentificationSchemeName1ChoiceSG1Cls.The
     * OrganisationIdentificationSchemeName1Choice-SG1 complex data
     * type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     * @see
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentificationSchemeName1Choice.OrganisationIdentificationSchemeName1ChoiceSG1
     */
    public static class OrganisationIdentificationSchemeName1ChoiceSG1Cls extends biz.c24.io.api.data.ComplexDataType {

        /**
         * Field instance.
         */
        protected static volatile iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentificationSchemeName1ChoiceCls.OrganisationIdentificationSchemeName1ChoiceSG1Cls instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected OrganisationIdentificationSchemeName1ChoiceSG1Cls() {
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
                        instance = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentificationSchemeName1ChoiceCls.OrganisationIdentificationSchemeName1ChoiceSG1Cls();
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
            setName("OrganisationIdentificationSchemeName1ChoiceSG1");
            setModel(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance());
            setOriginalName("OrganisationIdentificationSchemeName1Choice-SG1");
            setDatabaseColumnName("OrganisationIdentificationSchemeName1Choice-SG1");
            setLocal(true);
            setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.OrganisationIdentificationSchemeName1Choice.OrganisationIdentificationSchemeName1ChoiceSG1.class);
            setElementGroup(true);
            setContentModel(biz.c24.io.api.data.ContentModelEnum.CHOICE);
            biz.c24.io.api.data.Element element = null;
            addElementDecl(element = new biz.c24.io.api.data.Element("Cd", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ExternalOrganisationIdentification1CodeCls.class, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance()));
            element.setIgnoredElement(false);
            addElementDecl(element = new biz.c24.io.api.data.Element("Prtry", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Max35TextCls.class, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance()));
            element.setIgnoredElement(false);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

}
