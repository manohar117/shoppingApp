export const oktaConfig = {
    clientId  : `0oab8n0ecoe8Ta6G45d7`,
    issuer :`https://dev-09278596.okta.com/oauth2/default`,
    redirectUri:'http://localhost:3000/login/callback',
    scopes:['openid','profile','email'],
    pkce:true,
    disableHttpsCheck: true,
}