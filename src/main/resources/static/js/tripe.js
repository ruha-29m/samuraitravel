const stripe = Stripe('pk_test_51Ry31C1hf3CH9BbwpHVUmWPgT9WmRMX2eIAOz0rcNwhwpGNFmeI1rCJTFbAE1K6pY4LBTsYMoLnlAgjyVptHyUfK00jRBGmAPO
');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
 stripe.redirectToCheckout({
   sessionId: sessionId
 })
});