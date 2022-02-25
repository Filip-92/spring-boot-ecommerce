export default {

    oidc: {
        clientId: '{YOUR_CLIENT_ID}',
        issuer: 'https://{YOUR_ISSUER_NUMBER}.okta.com/oauth2/default',
        redirectUri: 'https://localhost:4200/login/callback',
        scopes: ['openid', 'profile', 'email']
    }
}
