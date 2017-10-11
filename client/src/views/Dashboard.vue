<template>
  <div class="animated fadeIn">
    <div class="row">
      <div class="col-6 col-lg-3">
        <b-card :no-body="true">
          <div class="card-body p-0 clearfix">
            <i class="icon-people bg-success p-4 font-2xl mr-3 float-left"></i>
            <div class="h5 text-primary mb-0 pt-3">{{status.players}}</div>
            <div class="text-muted text-uppercase font-weight-bold font-xs">Players online</div>
          </div>
        </b-card>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'dashboard',
    data () {
      return {
        status: {
          players: '',
          vip: '',
          startTime: '',
          serverVersion: ''
        }
      }
    },
    created () {
      this.readStatus()
    },
    methods: {
      readStatus () {
        this.$http.get('/api/status').then(response => {
          this.status = response.body
        })
      }
    }
  }
</script>
