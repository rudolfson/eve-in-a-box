<template>
  <div class="app flex-row align-items-center">
    <div class="container">
      <div class="row justify-content-center">
        <img src="static/img/eve_login.png" v-on:click="redirectToSSO"/>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Login',
  data () {
  },
  methods: {
    redirectToSSO () {
      let url = 'https://login.eveonline.com/oauth/authorize'
      url += '?response_type=code'
      url += '&redirect_uri=http%3A%2F%2Flocalhost%3A8800%2F%23%2Fpages%2Flogin'
      url += '&client_id=aa398ed41e1a433cbfd7e31e998b6b0c'
      url += '&scope=esi-planets.manage_planets.v1'
      url += '&state=eveinabox'
      window.location = url
    }
  }
}
</script>
