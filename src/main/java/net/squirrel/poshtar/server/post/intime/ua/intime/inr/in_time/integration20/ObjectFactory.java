
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.math.BigDecimal;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ua.intime.inr.in_time.integration20 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddTTNRespondTTNState_QNAME = new QName("http://inr.intime.ua/in-time/integration20", "TTNState");
    private final static QName _AddTTNRespondAmount_QNAME = new QName("http://inr.intime.ua/in-time/integration20", "Amount");
    private final static QName _AddTTNRespondNumber_QNAME = new QName("http://inr.intime.ua/in-time/integration20", "Number");
    private final static QName _TransferCargoViewRespondStatus_QNAME = new QName("http://inr.intime.ua/in-time/integration20", "Status");
    private final static QName _CargoCargoDescription_QNAME = new QName("http://inr.intime.ua/in-time/integration20", "CargoDescription");
    private final static QName _ReceiverSettlementCode_QNAME = new QName("http://inr.intime.ua/in-time/integration20", "SettlementCode");
    private final static QName _ClaimRequestClaimComment_QNAME = new QName("http://inr.intime.ua/in-time/integration20", "ClaimComment");
    private final static QName _CheckoutRespondMessage_QNAME = new QName("http://inr.intime.ua/in-time/integration20", "Message");
    private final static QName _InfoNumberAssociatedDocument_QNAME = new QName("http://inr.intime.ua/in-time/integration20", "AssociatedDocument");
    private final static QName _CreatingReferenceRespondReferenceNumberDocument_QNAME = new QName("http://inr.intime.ua/in-time/integration20", "ReferenceNumberDocument");
    private final static QName _CreatingReferenceRequestContractorPaysThird_QNAME = new QName("http://inr.intime.ua/in-time/integration20", "ContractorPaysThird");
    private final static QName _CalculateRespondDeliveryDate_QNAME = new QName("http://inr.intime.ua/in-time/integration20", "DeliveryDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ua.intime.inr.in_time.integration20
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserWarningListRequest }
     * 
     */
    public UserWarningListRequest createUserWarningListRequest() {
        return new UserWarningListRequest();
    }

    /**
     * Create an instance of {@link UserWarningListRespond }
     * 
     */
    public UserWarningListRespond createUserWarningListRespond() {
        return new UserWarningListRespond();
    }

    /**
     * Create an instance of {@link ListTTNRequest }
     * 
     */
    public ListTTNRequest createListTTNRequest() {
        return new ListTTNRequest();
    }

    /**
     * Create an instance of {@link PrintLabelsExtRequest }
     * 
     */
    public PrintLabelsExtRequest createPrintLabelsExtRequest() {
        return new PrintLabelsExtRequest();
    }

    /**
     * Create an instance of {@link DayOfDeliveryRequest }
     * 
     */
    public DayOfDeliveryRequest createDayOfDeliveryRequest() {
        return new DayOfDeliveryRequest();
    }

    /**
     * Create an instance of {@link AllCatalogRequest }
     * 
     */
    public AllCatalogRequest createAllCatalogRequest() {
        return new AllCatalogRequest();
    }

    /**
     * Create an instance of {@link ReserveNumbersRespond }
     * 
     */
    public ReserveNumbersRespond createReserveNumbersRespond() {
        return new ReserveNumbersRespond();
    }

    /**
     * Create an instance of {@link DeleteTTNRespond }
     * 
     */
    public DeleteTTNRespond createDeleteTTNRespond() {
        return new DeleteTTNRespond();
    }

    /**
     * Create an instance of {@link ClaimRespond }
     * 
     */
    public ClaimRespond createClaimRespond() {
        return new ClaimRespond();
    }

    /**
     * Create an instance of {@link CalculateRespond }
     * 
     */
    public CalculateRespond createCalculateRespond() {
        return new CalculateRespond();
    }

    /**
     * Create an instance of {@link ActOfReconciliationRequest }
     * 
     */
    public ActOfReconciliationRequest createActOfReconciliationRequest() {
        return new ActOfReconciliationRequest();
    }

    /**
     * Create an instance of {@link CreatingReferenceRespond }
     * 
     */
    public CreatingReferenceRespond createCreatingReferenceRespond() {
        return new CreatingReferenceRespond();
    }

    /**
     * Create an instance of {@link InfoTTNRespond }
     * 
     */
    public InfoTTNRespond createInfoTTNRespond() {
        return new InfoTTNRespond();
    }

    /**
     * Create an instance of {@link PrintLabelsRespond }
     * 
     */
    public PrintLabelsRespond createPrintLabelsRespond() {
        return new PrintLabelsRespond();
    }

    /**
     * Create an instance of {@link TransferCargoViewRequest }
     * 
     */
    public TransferCargoViewRequest createTransferCargoViewRequest() {
        return new TransferCargoViewRequest();
    }

    /**
     * Create an instance of {@link CheckoutRespond }
     * 
     */
    public CheckoutRespond createCheckoutRespond() {
        return new CheckoutRespond();
    }

    /**
     * Create an instance of {@link CheckoutRequest }
     * 
     */
    public CheckoutRequest createCheckoutRequest() {
        return new CheckoutRequest();
    }

    /**
     * Create an instance of {@link TransferCargoListRespond }
     * 
     */
    public TransferCargoListRespond createTransferCargoListRespond() {
        return new TransferCargoListRespond();
    }

    /**
     * Create an instance of {@link TransferCargoListRequest }
     * 
     */
    public TransferCargoListRequest createTransferCargoListRequest() {
        return new TransferCargoListRequest();
    }

    /**
     * Create an instance of {@link PrintTTNRespond }
     * 
     */
    public PrintTTNRespond createPrintTTNRespond() {
        return new PrintTTNRespond();
    }

    /**
     * Create an instance of {@link ReferenceListRequest }
     * 
     */
    public ReferenceListRequest createReferenceListRequest() {
        return new ReferenceListRequest();
    }

    /**
     * Create an instance of {@link PrintLabelsRequest }
     * 
     */
    public PrintLabelsRequest createPrintLabelsRequest() {
        return new PrintLabelsRequest();
    }

    /**
     * Create an instance of {@link PrintTTNExtRespond }
     * 
     */
    public PrintTTNExtRespond createPrintTTNExtRespond() {
        return new PrintTTNExtRespond();
    }

    /**
     * Create an instance of {@link ActOfReconciliationRespond }
     * 
     */
    public ActOfReconciliationRespond createActOfReconciliationRespond() {
        return new ActOfReconciliationRespond();
    }

    /**
     * Create an instance of {@link AllCatalogRespond }
     * 
     */
    public AllCatalogRespond createAllCatalogRespond() {
        return new AllCatalogRespond();
    }

    /**
     * Create an instance of {@link TransferCargoViewRespond }
     * 
     */
    public TransferCargoViewRespond createTransferCargoViewRespond() {
        return new TransferCargoViewRespond();
    }

    /**
     * Create an instance of {@link CatalogListRequest }
     * 
     */
    public CatalogListRequest createCatalogListRequest() {
        return new CatalogListRequest();
    }

    /**
     * Create an instance of {@link ReferenceListRespond }
     * 
     */
    public ReferenceListRespond createReferenceListRespond() {
        return new ReferenceListRespond();
    }

    /**
     * Create an instance of {@link CreatingReferenceRequest }
     * 
     */
    public CreatingReferenceRequest createCreatingReferenceRequest() {
        return new CreatingReferenceRequest();
    }

    /**
     * Create an instance of {@link TransferCargoRespond }
     * 
     */
    public TransferCargoRespond createTransferCargoRespond() {
        return new TransferCargoRespond();
    }

    /**
     * Create an instance of {@link PrintTTNExtRequest }
     * 
     */
    public PrintTTNExtRequest createPrintTTNExtRequest() {
        return new PrintTTNExtRequest();
    }

    /**
     * Create an instance of {@link InfoTTNRequest }
     * 
     */
    public InfoTTNRequest createInfoTTNRequest() {
        return new InfoTTNRequest();
    }

    /**
     * Create an instance of {@link TransferCargoRequest }
     * 
     */
    public TransferCargoRequest createTransferCargoRequest() {
        return new TransferCargoRequest();
    }

    /**
     * Create an instance of {@link PrintLabelsExtRespond }
     * 
     */
    public PrintLabelsExtRespond createPrintLabelsExtRespond() {
        return new PrintLabelsExtRespond();
    }

    /**
     * Create an instance of {@link CatalogListRespond }
     * 
     */
    public CatalogListRespond createCatalogListRespond() {
        return new CatalogListRespond();
    }

    /**
     * Create an instance of {@link CalculateRequest }
     * 
     */
    public CalculateRequest createCalculateRequest() {
        return new CalculateRequest();
    }

    /**
     * Create an instance of {@link DeleteTTNRequest }
     * 
     */
    public DeleteTTNRequest createDeleteTTNRequest() {
        return new DeleteTTNRequest();
    }

    /**
     * Create an instance of {@link PrintTTNRequest }
     * 
     */
    public PrintTTNRequest createPrintTTNRequest() {
        return new PrintTTNRequest();
    }

    /**
     * Create an instance of {@link ListTTNRespond }
     * 
     */
    public ListTTNRespond createListTTNRespond() {
        return new ListTTNRespond();
    }

    /**
     * Create an instance of {@link AddTTNRequest }
     * 
     */
    public AddTTNRequest createAddTTNRequest() {
        return new AddTTNRequest();
    }

    /**
     * Create an instance of {@link DayOfDeliveryRespond }
     * 
     */
    public DayOfDeliveryRespond createDayOfDeliveryRespond() {
        return new DayOfDeliveryRespond();
    }

    /**
     * Create an instance of {@link AddTTNRespond }
     * 
     */
    public AddTTNRespond createAddTTNRespond() {
        return new AddTTNRespond();
    }

    /**
     * Create an instance of {@link ClaimRequest }
     * 
     */
    public ClaimRequest createClaimRequest() {
        return new ClaimRequest();
    }

    /**
     * Create an instance of {@link InformationField }
     * 
     */
    public InformationField createInformationField() {
        return new InformationField();
    }

    /**
     * Create an instance of {@link ChangeRespond }
     * 
     */
    public ChangeRespond createChangeRespond() {
        return new ChangeRespond();
    }

    /**
     * Create an instance of {@link ChangeRequest }
     * 
     */
    public ChangeRequest createChangeRequest() {
        return new ChangeRequest();
    }

    /**
     * Create an instance of {@link ContractorPaysThird }
     * 
     */
    public ContractorPaysThird createContractorPaysThird() {
        return new ContractorPaysThird();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link InfoNumber }
     * 
     */
    public InfoNumber createInfoNumber() {
        return new InfoNumber();
    }

    /**
     * Create an instance of {@link ReservedField }
     * 
     */
    public ReservedField createReservedField() {
        return new ReservedField();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link POD }
     * 
     */
    public POD createPOD() {
        return new POD();
    }

    /**
     * Create an instance of {@link TTNState }
     * 
     */
    public TTNState createTTNState() {
        return new TTNState();
    }

    /**
     * Create an instance of {@link PrintTTNExt }
     * 
     */
    public PrintTTNExt createPrintTTNExt() {
        return new PrintTTNExt();
    }

    /**
     * Create an instance of {@link PackagingClientRespond }
     * 
     */
    public PackagingClientRespond createPackagingClientRespond() {
        return new PackagingClientRespond();
    }

    /**
     * Create an instance of {@link Sender }
     * 
     */
    public Sender createSender() {
        return new Sender();
    }

    /**
     * Create an instance of {@link PackagingClientBack }
     * 
     */
    public PackagingClientBack createPackagingClientBack() {
        return new PackagingClientBack();
    }

    /**
     * Create an instance of {@link Package }
     * 
     */
    public Package createPackage() {
        return new Package();
    }

    /**
     * Create an instance of {@link Cargo }
     * 
     */
    public Cargo createCargo() {
        return new Cargo();
    }

    /**
     * Create an instance of {@link TransferCargoVerificationRequest }
     * 
     */
    public TransferCargoVerificationRequest createTransferCargoVerificationRequest() {
        return new TransferCargoVerificationRequest();
    }

    /**
     * Create an instance of {@link TransferCargoVerificationRespond }
     * 
     */
    public TransferCargoVerificationRespond createTransferCargoVerificationRespond() {
        return new TransferCargoVerificationRespond();
    }

    /**
     * Create an instance of {@link ListCatalog }
     * 
     */
    public ListCatalog createListCatalog() {
        return new ListCatalog();
    }

    /**
     * Create an instance of {@link AdditionalServices }
     * 
     */
    public AdditionalServices createAdditionalServices() {
        return new AdditionalServices();
    }

    /**
     * Create an instance of {@link UserWarningList }
     * 
     */
    public UserWarningList createUserWarningList() {
        return new UserWarningList();
    }

    /**
     * Create an instance of {@link ReferenceList }
     * 
     */
    public ReferenceList createReferenceList() {
        return new ReferenceList();
    }

    /**
     * Create an instance of {@link TransferCargo }
     * 
     */
    public TransferCargo createTransferCargo() {
        return new TransferCargo();
    }

    /**
     * Create an instance of {@link Settlement }
     * 
     */
    public Settlement createSettlement() {
        return new Settlement();
    }

    /**
     * Create an instance of {@link CalculateTTN }
     * 
     */
    public CalculateTTN createCalculateTTN() {
        return new CalculateTTN();
    }

    /**
     * Create an instance of {@link AppendField }
     * 
     */
    public AppendField createAppendField() {
        return new AppendField();
    }

    /**
     * Create an instance of {@link TabularSectionTransferCargo }
     * 
     */
    public TabularSectionTransferCargo createTabularSectionTransferCargo() {
        return new TabularSectionTransferCargo();
    }

    /**
     * Create an instance of {@link AllCatalog }
     * 
     */
    public AllCatalog createAllCatalog() {
        return new AllCatalog();
    }

    /**
     * Create an instance of {@link InfoTTNLiteRequest }
     * 
     */
    public InfoTTNLiteRequest createInfoTTNLiteRequest() {
        return new InfoTTNLiteRequest();
    }

    /**
     * Create an instance of {@link Label }
     * 
     */
    public Label createLabel() {
        return new Label();
    }

    /**
     * Create an instance of {@link ReserveNumbersRequest }
     * 
     */
    public ReserveNumbersRequest createReserveNumbersRequest() {
        return new ReserveNumbersRequest();
    }

    /**
     * Create an instance of {@link PrintTTNParametr }
     * 
     */
    public PrintTTNParametr createPrintTTNParametr() {
        return new PrintTTNParametr();
    }

    /**
     * Create an instance of {@link FieldToChange }
     * 
     */
    public FieldToChange createFieldToChange() {
        return new FieldToChange();
    }

    /**
     * Create an instance of {@link InfoTTNExtRequest }
     * 
     */
    public InfoTTNExtRequest createInfoTTNExtRequest() {
        return new InfoTTNExtRequest();
    }

    /**
     * Create an instance of {@link InfoTTNLiteRespond }
     * 
     */
    public InfoTTNLiteRespond createInfoTTNLiteRespond() {
        return new InfoTTNLiteRespond();
    }

    /**
     * Create an instance of {@link ListInformationTTNFieldRequest }
     * 
     */
    public ListInformationTTNFieldRequest createListInformationTTNFieldRequest() {
        return new ListInformationTTNFieldRequest();
    }

    /**
     * Create an instance of {@link InfoTTNExtRespond }
     * 
     */
    public InfoTTNExtRespond createInfoTTNExtRespond() {
        return new InfoTTNExtRespond();
    }

    /**
     * Create an instance of {@link AuthData }
     * 
     */
    public AuthData createAuthData() {
        return new AuthData();
    }

    /**
     * Create an instance of {@link TakingBackVolume }
     * 
     */
    public TakingBackVolume createTakingBackVolume() {
        return new TakingBackVolume();
    }

    /**
     * Create an instance of {@link PackagingClient }
     * 
     */
    public PackagingClient createPackagingClient() {
        return new PackagingClient();
    }

    /**
     * Create an instance of {@link Receiver }
     * 
     */
    public Receiver createReceiver() {
        return new Receiver();
    }

    /**
     * Create an instance of {@link ListInformationTTNFieldRespond }
     * 
     */
    public ListInformationTTNFieldRespond createListInformationTTNFieldRespond() {
        return new ListInformationTTNFieldRespond();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link TransportationTypesListRequest }
     * 
     */
    public TransportationTypesListRequest createTransportationTypesListRequest() {
        return new TransportationTypesListRequest();
    }

    /**
     * Create an instance of {@link PrintLabelsExt }
     * 
     */
    public PrintLabelsExt createPrintLabelsExt() {
        return new PrintLabelsExt();
    }

    /**
     * Create an instance of {@link PaymentsTypesListRequest }
     * 
     */
    public PaymentsTypesListRequest createPaymentsTypesListRequest() {
        return new PaymentsTypesListRequest();
    }

    /**
     * Create an instance of {@link TransportationType }
     * 
     */
    public TransportationType createTransportationType() {
        return new TransportationType();
    }

    /**
     * Create an instance of {@link TTNClient }
     * 
     */
    public TTNClient createTTNClient() {
        return new TTNClient();
    }

    /**
     * Create an instance of {@link Cost }
     * 
     */
    public Cost createCost() {
        return new Cost();
    }

    /**
     * Create an instance of {@link TTN }
     * 
     */
    public TTN createTTN() {
        return new TTN();
    }

    /**
     * Create an instance of {@link PaymentsTypesListRespond }
     * 
     */
    public PaymentsTypesListRespond createPaymentsTypesListRespond() {
        return new PaymentsTypesListRespond();
    }

    /**
     * Create an instance of {@link net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20.Number }
     * 
     */
    public net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20.Number createNumber() {
        return new net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20.Number();
    }

    /**
     * Create an instance of {@link TransferCargoList }
     * 
     */
    public TransferCargoList createTransferCargoList() {
        return new TransferCargoList();
    }

    /**
     * Create an instance of {@link Reconciliation }
     * 
     */
    public Reconciliation createReconciliation() {
        return new Reconciliation();
    }

    /**
     * Create an instance of {@link TransportationTypesListRespond }
     * 
     */
    public TransportationTypesListRespond createTransportationTypesListRespond() {
        return new TransportationTypesListRespond();
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link PackagingClientRequest }
     * 
     */
    public PackagingClientRequest createPackagingClientRequest() {
        return new PackagingClientRequest();
    }

    /**
     * Create an instance of {@link CargoParams }
     * 
     */
    public CargoParams createCargoParams() {
        return new CargoParams();
    }

    /**
     * Create an instance of {@link net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20.Error }
     * 
     */
    public net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20.Error createError() {
        return new net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20.Error();
    }

    /**
     * Create an instance of {@link ReceiverPODThird }
     * 
     */
    public ReceiverPODThird createReceiverPODThird() {
        return new ReceiverPODThird();
    }

    /**
     * Create an instance of {@link CatalogElement }
     * 
     */
    public CatalogElement createCatalogElement() {
        return new CatalogElement();
    }

    /**
     * Create an instance of {@link DocumentDataTransferCargo }
     * 
     */
    public DocumentDataTransferCargo createDocumentDataTransferCargo() {
        return new DocumentDataTransferCargo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inr.intime.ua/in-time/integration20", name = "TTNState", scope = AddTTNRespond.class)
    public JAXBElement<String> createAddTTNRespondTTNState(String value) {
        return new JAXBElement<String>(_AddTTNRespondTTNState_QNAME, String.class, AddTTNRespond.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inr.intime.ua/in-time/integration20", name = "Amount", scope = AddTTNRespond.class)
    public JAXBElement<BigDecimal> createAddTTNRespondAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddTTNRespondAmount_QNAME, BigDecimal.class, AddTTNRespond.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inr.intime.ua/in-time/integration20", name = "Number", scope = AddTTNRespond.class)
    public JAXBElement<String> createAddTTNRespondNumber(String value) {
        return new JAXBElement<String>(_AddTTNRespondNumber_QNAME, String.class, AddTTNRespond.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inr.intime.ua/in-time/integration20", name = "Status", scope = TransferCargoViewRespond.class)
    public JAXBElement<String> createTransferCargoViewRespondStatus(String value) {
        return new JAXBElement<String>(_TransferCargoViewRespondStatus_QNAME, String.class, TransferCargoViewRespond.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inr.intime.ua/in-time/integration20", name = "CargoDescription", scope = Cargo.class)
    public JAXBElement<String> createCargoCargoDescription(String value) {
        return new JAXBElement<String>(_CargoCargoDescription_QNAME, String.class, Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inr.intime.ua/in-time/integration20", name = "SettlementCode", scope = Receiver.class)
    public JAXBElement<String> createReceiverSettlementCode(String value) {
        return new JAXBElement<String>(_ReceiverSettlementCode_QNAME, String.class, Receiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inr.intime.ua/in-time/integration20", name = "ClaimComment", scope = ClaimRequest.class)
    public JAXBElement<String> createClaimRequestClaimComment(String value) {
        return new JAXBElement<String>(_ClaimRequestClaimComment_QNAME, String.class, ClaimRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inr.intime.ua/in-time/integration20", name = "Message", scope = CheckoutRespond.class)
    public JAXBElement<String> createCheckoutRespondMessage(String value) {
        return new JAXBElement<String>(_CheckoutRespondMessage_QNAME, String.class, CheckoutRespond.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inr.intime.ua/in-time/integration20", name = "AssociatedDocument", scope = InfoNumber.class)
    public JAXBElement<String> createInfoNumberAssociatedDocument(String value) {
        return new JAXBElement<String>(_InfoNumberAssociatedDocument_QNAME, String.class, InfoNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inr.intime.ua/in-time/integration20", name = "SettlementCode", scope = Sender.class)
    public JAXBElement<String> createSenderSettlementCode(String value) {
        return new JAXBElement<String>(_ReceiverSettlementCode_QNAME, String.class, Sender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inr.intime.ua/in-time/integration20", name = "ReferenceNumberDocument", scope = CreatingReferenceRespond.class)
    public JAXBElement<String> createCreatingReferenceRespondReferenceNumberDocument(String value) {
        return new JAXBElement<String>(_CreatingReferenceRespondReferenceNumberDocument_QNAME, String.class, CreatingReferenceRespond.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inr.intime.ua/in-time/integration20", name = "Message", scope = CreatingReferenceRespond.class)
    public JAXBElement<String> createCreatingReferenceRespondMessage(String value) {
        return new JAXBElement<String>(_CheckoutRespondMessage_QNAME, String.class, CreatingReferenceRespond.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inr.intime.ua/in-time/integration20", name = "Status", scope = ClaimRespond.class)
    public JAXBElement<String> createClaimRespondStatus(String value) {
        return new JAXBElement<String>(_TransferCargoViewRespondStatus_QNAME, String.class, ClaimRespond.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractorPaysThird }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inr.intime.ua/in-time/integration20", name = "ContractorPaysThird", scope = CreatingReferenceRequest.class)
    public JAXBElement<ContractorPaysThird> createCreatingReferenceRequestContractorPaysThird(ContractorPaysThird value) {
        return new JAXBElement<ContractorPaysThird>(_CreatingReferenceRequestContractorPaysThird_QNAME, ContractorPaysThird.class, CreatingReferenceRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inr.intime.ua/in-time/integration20", name = "DeliveryDate", scope = CalculateRespond.class)
    public JAXBElement<String> createCalculateRespondDeliveryDate(String value) {
        return new JAXBElement<String>(_CalculateRespondDeliveryDate_QNAME, String.class, CalculateRespond.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inr.intime.ua/in-time/integration20", name = "Amount", scope = CalculateRespond.class)
    public JAXBElement<BigDecimal> createCalculateRespondAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddTTNRespondAmount_QNAME, BigDecimal.class, CalculateRespond.class, value);
    }

}
