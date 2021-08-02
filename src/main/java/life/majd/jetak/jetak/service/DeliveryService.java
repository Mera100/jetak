package life.majd.jetak.jetak.service;

import life.majd.jetak.jetak.domain.Order;

public interface DeliveryService {
    /**
     * Accept a delivery job
     * The
     * @param orderId: ID of the accepted Order, the Courier will then be assigned for this Order.
     * @param courierUsername Username of the Courier
     * @return accepted Order.
     */
    Order acceptDeliveryJob(Long orderId, String courierUsername);

    /**
     * Cancel a delivery Job without further effects, the status of the order will be set back
     * to PAID, and will be again available for other Couriers to accept.
     * @param orderId ID of the Order to cancel.
     * @param courierUsername Username of the Courier
     * @return The canceled Order
     */
    Order cancelDeliveryJob(Long orderId, String courierUsername);

    /**
     * This methode will be called upon receiving an order from the business.
     * The Order will then be on its way to the customer.
     * @param orderId ID of the Order handed over by the business.
     * @param courierUsername Username of the Courier
     * @return Order recieved from business
     */
    Order receiveOrderFromBusiness(Long orderId, String courierUsername);
    /**
     * This will be called by the courier at the moment of delivery.
     * The status of the Delivery will then be set to DELIVERED
     * @param orderId ID of the Order to hand over to the customer.
     * @param courierUsername Username of the Courier
     * @return The Order
     */
    Order deliverOrderToCustomer(Long orderId, String courierUsername);

    /**
     * methode to report a problem while delivering an Order.
     * Order status will be set to canceled.
     * @param orderId Id of the order to report problem about.
     * @param description text to describe the occurred problem.
     * @return The Order
     */
    Order reportProblem(Long orderId, String description);



}
